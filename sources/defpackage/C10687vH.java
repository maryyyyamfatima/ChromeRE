package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.common.Feature;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.chromium.components.media_router.caf.CastOptionsProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vH */
/* loaded from: classes.dex */
public final class C10687vH {
    public static final C4856eI1 h = new C4856eI1("CastContext");
    public static final Object i = new Object();
    public static volatile C10687vH j;
    public final Context a;
    public final InterfaceC12156za1 b;
    public final I43 c;
    public final CastOptions d;
    public final BinderC6619jR1 e;
    public final List f;
    public UH g;

    public final void d(String str) {
        C10687vH c10687vH;
        C6614jQ1 c6614jQ1;
        AbstractC9250r5 abstractC9250r5;
        C4856eI1 c4856eI1 = h;
        CastOptions castOptions = this.d;
        if (TextUtils.equals(str, castOptions.a)) {
            return;
        }
        castOptions.a = str;
        boolean isEmpty = TextUtils.isEmpty(castOptions.a);
        Context context = this.a;
        if (!isEmpty) {
            this.g = new UH(context, castOptions, this.e);
        } else {
            this.g = null;
        }
        HashMap a = a();
        try {
            C11470xa1 c11470xa1 = (C11470xa1) this.b;
            Parcel a2 = c11470xa1.a();
            a2.writeString(str);
            a2.writeMap(a);
            c11470xa1.h(11, a2);
        } catch (RemoteException unused) {
            c4856eI1.b("Unable to call %s on %s.", "setReceiverApplicationId", InterfaceC12156za1.class.getSimpleName());
        }
        Iterator it = AbstractC6567jH.b.iterator();
        while (it.hasNext()) {
            MenuItem menuItem = (MenuItem) ((WeakReference) it.next()).get();
            if (menuItem != null) {
                try {
                    if (menuItem instanceof InterfaceMenuItemC2028Pp3) {
                        abstractC9250r5 = ((InterfaceMenuItemC2028Pp3) menuItem).b();
                    } else {
                        Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
                        abstractC9250r5 = null;
                    }
                    AbstractC6225iH.a(abstractC9250r5);
                    throw new IllegalArgumentException();
                    break;
                } catch (IllegalArgumentException e) {
                    AbstractC6567jH.a.g("Unexpected exception when refreshing MediaRouteSelectors for Cast buttons", e);
                }
            }
        }
        Iterator it2 = AbstractC6567jH.c.iterator();
        while (it2.hasNext()) {
            MediaRouteButton mediaRouteButton = (MediaRouteButton) ((WeakReference) it2.next()).get();
            if (mediaRouteButton != null) {
                try {
                    c10687vH = c(context);
                } catch (RuntimeException e2) {
                    c4856eI1.d("Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently.", e2);
                    c10687vH = null;
                }
                if (c10687vH != null) {
                    try {
                        C11470xa1 c11470xa12 = (C11470xa1) c10687vH.b;
                        Parcel e3 = c11470xa12.e(1, c11470xa12.a());
                        Bundle bundle = (Bundle) AbstractC11786yV.a(e3, Bundle.CREATOR);
                        e3.recycle();
                        c6614jQ1 = C6614jQ1.b(bundle);
                    } catch (RemoteException unused2) {
                        c4856eI1.b("Unable to call %s on %s.", "getMergedSelectorAsBundle", InterfaceC12156za1.class.getSimpleName());
                        c6614jQ1 = null;
                    }
                    if (c6614jQ1 != null) {
                        mediaRouteButton.e(c6614jQ1);
                    }
                }
            }
        }
    }

    public static C10687vH c(Context context) {
        if (j == null) {
            synchronized (i) {
                if (j == null) {
                    Context applicationContext = context.getApplicationContext();
                    CastOptionsProvider b = b(applicationContext);
                    CastOptions castOptions = b.getCastOptions(applicationContext);
                    C5537gH c5537gH = new C5537gH(applicationContext);
                    try {
                        j = new C10687vH(applicationContext, castOptions, b.getAdditionalSessionProviders(applicationContext), new BinderC6619jR1(MQ1.d(applicationContext), castOptions, c5537gH), c5537gH);
                    } catch (GY1 e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return j;
    }

    public static CastOptionsProvider b(Context context) {
        try {
            Bundle bundle = C4021br4.a(context).a(128, context.getPackageName()).metaData;
            if (bundle == null) {
                h.d("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string == null) {
                throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
            }
            return (CastOptionsProvider) Class.forName(string).asSubclass(CastOptionsProvider.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    public C10687vH(Context context, CastOptions castOptions, List list, BinderC6619jR1 binderC6619jR1, final C5537gH c5537gH) {
        this.a = context;
        this.d = castOptions;
        this.e = binderC6619jR1;
        this.f = list;
        UQ1 uq1 = new UQ1(context);
        InterfaceC10814vf1 interfaceC10814vf1 = null;
        if (TextUtils.isEmpty(castOptions.a)) {
            this.g = null;
        } else {
            this.g = new UH(context, castOptions, binderC6619jR1);
        }
        try {
            InterfaceC12156za1 b = AbstractC11373xH.b(context, castOptions, binderC6619jR1, a());
            this.b = b;
            try {
                C11470xa1 c11470xa1 = (C11470xa1) b;
                Parcel e = c11470xa1.e(6, c11470xa1.a());
                IBinder readStrongBinder = e.readStrongBinder();
                int i2 = AbstractBinderC1437Lb1.a;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    if (queryLocalInterface instanceof InterfaceC1566Mb1) {
                    }
                }
                e.recycle();
                try {
                    C11470xa1 c11470xa12 = (C11470xa1) b;
                    Parcel e2 = c11470xa12.e(5, c11470xa12.a());
                    IBinder readStrongBinder2 = e2.readStrongBinder();
                    int i3 = AbstractBinderC10471uf1.a;
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        interfaceC10814vf1 = queryLocalInterface2 instanceof InterfaceC10814vf1 ? (InterfaceC10814vf1) queryLocalInterface2 : new C10128tf1(readStrongBinder2);
                    }
                    e2.recycle();
                    I43 i43 = new I43(interfaceC10814vf1, context);
                    this.c = i43;
                    R43 r43 = binderC6619jR1.i;
                    if (r43 != null) {
                        r43.e = i43;
                    }
                    try {
                        SQ1 sq1 = uq1.a;
                        C11470xa1 c11470xa13 = (C11470xa1) b;
                        Parcel a = c11470xa13.a();
                        AbstractC11786yV.c(a, sq1);
                        c11470xa13.h(3, a);
                        if (!Collections.unmodifiableList(castOptions.p).isEmpty()) {
                            h.f("Setting Route Discovery for appIds: ".concat(String.valueOf(Collections.unmodifiableList(castOptions.p))), new Object[0]);
                            List unmodifiableList = Collections.unmodifiableList(castOptions.p);
                            UQ1.f.a(AbstractC9307rF1.a("SetRouteDiscovery for ", unmodifiableList.size(), " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            Iterator it = unmodifiableList.iterator();
                            while (it.hasNext()) {
                                linkedHashSet.add(AbstractC6722jk.b((String) it.next()));
                            }
                            UQ1.f.a("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(uq1.c.keySet())), new Object[0]);
                            HashMap hashMap = new HashMap();
                            synchronized (uq1.c) {
                                for (String str : linkedHashSet) {
                                    RQ1 rq1 = (RQ1) uq1.c.get(AbstractC6722jk.b(str));
                                    if (rq1 != null) {
                                        hashMap.put(str, rq1);
                                    }
                                }
                                uq1.c.clear();
                                uq1.c.putAll(hashMap);
                            }
                            UQ1.f.a("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(uq1.c.keySet())), new Object[0]);
                            synchronized (uq1.d) {
                                uq1.d.clear();
                                uq1.d.addAll(linkedHashSet);
                            }
                            uq1.n();
                        }
                        c5537gH.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).e(new InterfaceC7371ld2() { // from class: tH
                            @Override // defpackage.InterfaceC7371ld2
                            public final void a(Object obj) {
                                C10687vH.this.getClass();
                            }
                        });
                        final String[] strArr = {"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"};
                        C5531gF3 c5531gF3 = new C5531gF3();
                        c5531gF3.a = new InterfaceC5565gM2() { // from class: cH
                            @Override // defpackage.InterfaceC5565gM2
                            public final void accept(Object obj, Object obj2) {
                                C5537gH.this.getClass();
                                BinderC5193fH binderC5193fH = new BinderC5193fH((C6905kF3) obj2);
                                C1042Ia1 c1042Ia1 = (C1042Ia1) ((InterfaceC1302Ka1) ((C5881hH) obj).m());
                                Parcel a2 = c1042Ia1.a();
                                AbstractC11786yV.c(a2, binderC5193fH);
                                a2.writeStringArray(strArr);
                                c1042Ia1.M0(7, a2);
                            }
                        };
                        c5531gF3.c = new Feature[]{FI0.c};
                        c5531gF3.b = false;
                        c5531gF3.d = 8427;
                        c5537gH.b(0, c5531gF3.a()).e(new InterfaceC7371ld2() { // from class: uH
                            @Override // defpackage.InterfaceC7371ld2
                            public final void a(Object obj) {
                                C10687vH.this.getClass();
                                AbstractC12059zH.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
                            }
                        });
                    } catch (RemoteException e3) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e3);
                    }
                } catch (RemoteException e4) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e4);
                }
            } catch (RemoteException e5) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e5);
            }
        } catch (RemoteException e6) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e6);
        }
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        UH uh = this.g;
        if (uh != null) {
            hashMap.put(uh.b, uh.c);
        }
        List<UH> list = this.f;
        if (list != null) {
            for (UH uh2 : list) {
                String str = uh2.b;
                hashMap.containsKey(str);
                String.format("SessionProvider for category %s already added", str);
                hashMap.put(str, uh2.c);
            }
        }
        return hashMap;
    }
}
