package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RemoteViews;
import androidx.browser.customtabs.CustomTabsSessionToken;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.content_public.browser.MessagePort;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rb1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC9418rb1 extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC9418rb1() {
        attachInterface(this, "android.support.customtabs.ICustomTabsService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC8733pb1 c7702mb1;
        InterfaceC8733pb1 c7702mb12;
        InterfaceC8733pb1 c7702mb13;
        Bundle bundle;
        ArrayList<Bundle> arrayList;
        boolean z;
        Bitmap bitmap;
        String d;
        InterfaceC8733pb1 c7702mb14;
        WebContents webContents;
        int intValue;
        InterfaceC8733pb1 c7702mb15;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.customtabs.ICustomTabsService");
            return true;
        }
        r0 = 0;
        r0 = 0;
        int i3 = 0;
        r0 = 0;
        r0 = 0;
        int i4 = 0;
        int i5 = 0;
        r0 = 0;
        int i6 = 0;
        int i7 = 0;
        InterfaceC8733pb1 interfaceC8733pb1 = null;
        switch (i) {
            case 2:
                parcel.readLong();
                C3010Xe0 c3010Xe0 = ((BinderC4288cf0) this).a.i;
                int A = c3010Xe0.a() ? c3010Xe0.a.A() : 0;
                parcel2.writeNoException();
                parcel2.writeInt(A);
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c7702mb1 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
                    c7702mb1 = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC8733pb1)) ? new C7702mb1(readStrongBinder) : (InterfaceC8733pb1) queryLocalInterface;
                }
                boolean e = ((BinderC4288cf0) this).e(c7702mb1, null);
                parcel2.writeNoException();
                parcel2.writeInt(e ? 1 : 0);
                return true;
            case 4:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    c7702mb12 = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
                    c7702mb12 = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof InterfaceC8733pb1)) ? new C7702mb1(readStrongBinder2) : (InterfaceC8733pb1) queryLocalInterface2;
                }
                Uri uri = (Uri) AbstractC9761sb1.a(parcel, Uri.CREATOR);
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) AbstractC9761sb1.a(parcel, creator);
                ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
                CustomTabsSessionToken customTabsSessionToken = new CustomTabsSessionToken(c7702mb12, BinderC4288cf0.a(bundle2));
                C3010Xe0 c3010Xe02 = ((BinderC4288cf0) this).a.i;
                if (c3010Xe02.a()) {
                    CustomTabsConnection customTabsConnection = c3010Xe02.a;
                    customTabsConnection.getClass();
                    TraceEvent i8 = TraceEvent.i("CustomTabsConnection.mayLaunchUrl", null);
                    try {
                        boolean n = customTabsConnection.n(customTabsSessionToken, uri, bundle2, createTypedArrayList);
                        customTabsConnection.l(Boolean.valueOf(n), "mayLaunchUrl(" + uri + ")");
                        if (i8 != null) {
                            i8.close();
                        }
                        i7 = n ? 1 : 0;
                    } catch (Throwable th) {
                        if (i8 != null) {
                            try {
                                i8.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i7);
                return true;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                Bundle d2 = ((BinderC4288cf0) this).a.i.a.d(parcel.readString(), (Bundle) AbstractC9761sb1.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                if (d2 != null) {
                    parcel2.writeInt(1);
                    d2.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    c7702mb13 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
                    c7702mb13 = (queryLocalInterface3 == null || !(queryLocalInterface3 instanceof InterfaceC8733pb1)) ? new C7702mb1(readStrongBinder3) : (InterfaceC8733pb1) queryLocalInterface3;
                }
                Bundle bundle3 = (Bundle) AbstractC9761sb1.a(parcel, Bundle.CREATOR);
                CustomTabsSessionToken customTabsSessionToken2 = new CustomTabsSessionToken(c7702mb13, BinderC4288cf0.a(bundle3));
                C3010Xe0 c3010Xe03 = ((BinderC4288cf0) this).a.i;
                if (c3010Xe03.a()) {
                    CustomTabsConnection customTabsConnection2 = c3010Xe03.a;
                    if (customTabsConnection2.d) {
                        AbstractC4851eH1.f("ChromeConnection", "updateVisuals: %s", CustomTabsConnection.a(bundle3));
                    }
                    final C3265Zd0 a = customTabsConnection2.b.a(customTabsSessionToken2);
                    if (a != null) {
                        ComponentName componentName = AbstractC2281Ro1.a;
                        try {
                            bundle = bundle3.getBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE");
                        } catch (Throwable unused2) {
                            AbstractC4851eH1.a("IntentUtils", "getBundle failed on bundle " + bundle3, new Object[0]);
                            bundle = null;
                        }
                        final ArrayList arrayList2 = new ArrayList();
                        final ArrayList arrayList3 = new ArrayList();
                        final ArrayList arrayList4 = new ArrayList();
                        if (bundle != null) {
                            int m = AbstractC2281Ro1.m("android.support.customtabs.customaction.ID", 0, bundle);
                            Bitmap bitmap2 = (Bitmap) AbstractC2281Ro1.r("android.support.customtabs.customaction.ICON", bundle);
                            if (bitmap2 == null) {
                                bitmap2 = null;
                            }
                            String d3 = C12167zc0.d(bundle);
                            if (bitmap2 != null && d3 != null) {
                                arrayList2.add(Integer.valueOf(m));
                                arrayList3.add(d3);
                                arrayList4.add(bitmap2);
                            }
                        }
                        try {
                            arrayList = bundle3.getParcelableArrayList("android.support.customtabs.extra.TOOLBAR_ITEMS");
                        } catch (Throwable unused3) {
                            AbstractC4851eH1.a("IntentUtils", "getParcelableArrayList failed on bundle " + bundle3, new Object[0]);
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            for (Bundle bundle4 : arrayList) {
                                int m2 = AbstractC2281Ro1.m("android.support.customtabs.customaction.ID", 0, bundle4);
                                if (!arrayList2.contains(Integer.valueOf(m2))) {
                                    if (bundle4 == null || (bitmap = (Bitmap) AbstractC2281Ro1.r("android.support.customtabs.customaction.ICON", bundle4)) == null) {
                                        bitmap = null;
                                    }
                                    if (bitmap != null && (d = C12167zc0.d(bundle4)) != null) {
                                        arrayList2.add(Integer.valueOf(m2));
                                        arrayList3.add(d);
                                        arrayList4.add(bitmap);
                                    }
                                }
                            }
                        }
                        boolean booleanValue = !arrayList2.isEmpty() ? ((Boolean) PostTask.e(AbstractC5103f04.a, new Callable() { // from class: Me0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                InterfaceC11481xc0 interfaceC11481xc0;
                                boolean z2;
                                C9707sQ3 c9707sQ3;
                                HashSet hashSet = CustomTabsConnection.i;
                                boolean z3 = true;
                                int i9 = 0;
                                while (true) {
                                    List list = arrayList2;
                                    if (i9 < list.size()) {
                                        int intValue2 = ((Integer) list.get(i9)).intValue();
                                        Bitmap bitmap3 = (Bitmap) arrayList4.get(i9);
                                        String str = (String) arrayList3.get(i9);
                                        C3265Zd0 c3265Zd0 = a;
                                        Iterator it = c3265Zd0.a.b().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                interfaceC11481xc0 = null;
                                                break;
                                            }
                                            interfaceC11481xc0 = (InterfaceC11481xc0) it.next();
                                            if (intValue2 == ((C12167zc0) interfaceC11481xc0).b) {
                                                break;
                                            }
                                        }
                                        if (interfaceC11481xc0 == null) {
                                            AbstractC4851eH1.f("CctSessionHandler", "Custom toolbar button with ID %d not found", Integer.valueOf(intValue2));
                                        } else {
                                            C12167zc0 c12167zc0 = (C12167zc0) interfaceC11481xc0;
                                            c12167zc0.c = bitmap3;
                                            c12167zc0.d = str;
                                            boolean z4 = c12167zc0.f;
                                            int i10 = c12167zc0.b;
                                            if (z4) {
                                                C0801Ge0 c0801Ge0 = (C0801Ge0) c3265Zd0.h.get();
                                                c0801Ge0.getClass();
                                                Bitmap bitmap4 = c12167zc0.c;
                                                Activity activity = c0801Ge0.d;
                                                if (C12167zc0.a(activity, bitmap4)) {
                                                    List l = c0801Ge0.a.l();
                                                    int i11 = 0;
                                                    while (true) {
                                                        if (i11 >= l.size()) {
                                                            i11 = -1;
                                                            break;
                                                        }
                                                        if (((C12167zc0) ((InterfaceC11481xc0) l.get(i11))).b == i10) {
                                                            break;
                                                        }
                                                        i11++;
                                                    }
                                                    if (i11 != -1 && (c9707sQ3 = c0801Ge0.k) != null) {
                                                        c9707sQ3.k.a.Y(i11, c12167zc0.c(activity), c12167zc0.d);
                                                    }
                                                }
                                            } else {
                                                C8057nd0 c8057nd0 = (C8057nd0) c3265Zd0.i.get();
                                                ImageButton imageButton = (ImageButton) c8057nd0.c().findViewById(i10);
                                                imageButton.setContentDescription(c12167zc0.d);
                                                imageButton.setImageDrawable(c12167zc0.c(c8057nd0.a));
                                            }
                                            z2 = true;
                                            z3 &= z2;
                                            i9++;
                                        }
                                        z2 = false;
                                        z3 &= z2;
                                        i9++;
                                    } else {
                                        return Boolean.valueOf(z3);
                                    }
                                }
                            }
                        })).booleanValue() & true : true;
                        if (bundle3.containsKey("android.support.customtabs.extra.EXTRA_REMOTEVIEWS")) {
                            final RemoteViews remoteViews = (RemoteViews) AbstractC2281Ro1.r("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", bundle3);
                            final int[] n2 = AbstractC2281Ro1.n("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", bundle3);
                            final PendingIntent pendingIntent = (PendingIntent) AbstractC2281Ro1.r("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", bundle3);
                            z = ((Boolean) PostTask.e(AbstractC5103f04.a, new Callable() { // from class: Ne0
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    HashSet hashSet = CustomTabsConnection.i;
                                    C8057nd0 c8057nd0 = (C8057nd0) C3265Zd0.this.i.get();
                                    c8057nd0.getClass();
                                    FI2.a("CustomTabsRemoteViewsUpdated");
                                    RemoteViews remoteViews2 = remoteViews;
                                    boolean z2 = true;
                                    if (remoteViews2 == null) {
                                        ViewGroup viewGroup = c8057nd0.n;
                                        if (viewGroup == null) {
                                            z2 = false;
                                        } else {
                                            viewGroup.animate().alpha(0.0f).translationY(c8057nd0.n.getHeight()).setInterpolator(InterpolatorC0485Dt.c).setDuration(400L).withEndAction(new RunnableC7369ld0(c8057nd0)).start();
                                            ((CC) c8057nd0.h).k(0, 0);
                                            c8057nd0.p = null;
                                            c8057nd0.o = null;
                                        }
                                    } else {
                                        c8057nd0.p = n2;
                                        c8057nd0.o = pendingIntent;
                                        if (c8057nd0.c().getChildCount() > 1) {
                                            c8057nd0.c().removeViewAt(1);
                                        }
                                        z2 = c8057nd0.f(remoteViews2);
                                    }
                                    return Boolean.valueOf(z2);
                                }
                            })).booleanValue() & booleanValue;
                        } else {
                            z = booleanValue;
                        }
                        customTabsConnection2.l(Boolean.valueOf(z), "updateVisuals()");
                        i6 = z;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i6);
                return true;
            case 7:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    c7702mb14 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
                    c7702mb14 = (queryLocalInterface4 == null || !(queryLocalInterface4 instanceof InterfaceC8733pb1)) ? new C7702mb1(readStrongBinder4) : (InterfaceC8733pb1) queryLocalInterface4;
                }
                boolean b = ((BinderC4288cf0) this).a.b(new CustomTabsSessionToken(c7702mb14, null), (Uri) AbstractC9761sb1.a(parcel, Uri.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(b ? 1 : 0);
                return true;
            case 8:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
                    interfaceC8733pb1 = (queryLocalInterface5 == null || !(queryLocalInterface5 instanceof InterfaceC8733pb1)) ? new C7702mb1(readStrongBinder5) : (InterfaceC8733pb1) queryLocalInterface5;
                }
                String readString = parcel.readString();
                CustomTabsSessionToken customTabsSessionToken3 = new CustomTabsSessionToken(interfaceC8733pb1, BinderC4288cf0.a((Bundle) AbstractC9761sb1.a(parcel, Bundle.CREATOR)));
                C3010Xe0 c3010Xe04 = ((BinderC4288cf0) this).a.i;
                if (c3010Xe04.a()) {
                    CustomTabsConnection customTabsConnection3 = c3010Xe04.a;
                    customTabsConnection3.e.get();
                    if (!CustomTabsConnection.j()) {
                        customTabsConnection3.b.a(customTabsSessionToken3);
                    }
                    EU eu = customTabsConnection3.c;
                    eu.getClass();
                    Integer num = -3;
                    synchronized (eu) {
                        DU du = (DU) eu.c.get(customTabsSessionToken3);
                        if (du != null) {
                            C0118Ax2 c0118Ax2 = du.d;
                            MessagePort[] messagePortArr = c0118Ax2.d;
                            if (messagePortArr != null && !messagePortArr[0].isClosed() && (webContents = c0118Ax2.c) != null && !webContents.isDestroyed()) {
                                PostTask.c(AbstractC5103f04.a, new RunnableC12294zx2(c0118Ax2, readString));
                                EI2.b("CustomTabs.PostMessage.PostMessageFromClientApp", true);
                                num = Integer.valueOf(i5);
                            }
                            i5 = -3;
                            num = Integer.valueOf(i5);
                        }
                    }
                    intValue = num.intValue();
                    customTabsConnection3.l(Integer.valueOf(intValue), "postMessage");
                } else {
                    intValue = -1;
                }
                parcel2.writeNoException();
                parcel2.writeInt(intValue);
                return true;
            case 9:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 == null) {
                    c7702mb15 = null;
                } else {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
                    c7702mb15 = (queryLocalInterface6 == null || !(queryLocalInterface6 instanceof InterfaceC8733pb1)) ? new C7702mb1(readStrongBinder6) : (InterfaceC8733pb1) queryLocalInterface6;
                }
                int readInt = parcel.readInt();
                Uri uri2 = (Uri) AbstractC9761sb1.a(parcel, Uri.CREATOR);
                Bundle bundle5 = (Bundle) AbstractC9761sb1.a(parcel, Bundle.CREATOR);
                AbstractServiceC11514xh3 abstractServiceC11514xh3 = ((BinderC4288cf0) this).a;
                CustomTabsSessionToken customTabsSessionToken4 = new CustomTabsSessionToken(c7702mb15, BinderC4288cf0.a(bundle5));
                C3010Xe0 c3010Xe05 = abstractServiceC11514xh3.i;
                c3010Xe05.getClass();
                C1193Je2 a2 = C1193Je2.a(uri2);
                if (a2 != null) {
                    CustomTabsConnection customTabsConnection4 = c3010Xe05.a;
                    if (customTabsConnection4.e.get()) {
                        EU eu2 = customTabsConnection4.c;
                        synchronized (eu2) {
                            i4 = eu2.h(customTabsSessionToken4, readInt, a2, false);
                        }
                    } else {
                        C4632df0 a3 = customTabsConnection4.c.a(customTabsSessionToken4);
                        Uri parse = Uri.parse(a2.toString());
                        a3.getClass();
                        try {
                            ((C7702mb1) a3.a.a).M0(readInt, parse, false, null);
                        } catch (RemoteException unused4) {
                            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i4);
                return true;
            case 10:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
                    interfaceC8733pb1 = (queryLocalInterface7 == null || !(queryLocalInterface7 instanceof InterfaceC8733pb1)) ? new C7702mb1(readStrongBinder7) : (InterfaceC8733pb1) queryLocalInterface7;
                }
                boolean e2 = ((BinderC4288cf0) this).e(interfaceC8733pb1, BinderC4288cf0.a((Bundle) AbstractC9761sb1.a(parcel, Bundle.CREATOR)));
                parcel2.writeNoException();
                parcel2.writeInt(e2 ? 1 : 0);
                return true;
            case 11:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
                    interfaceC8733pb1 = (queryLocalInterface8 == null || !(queryLocalInterface8 instanceof InterfaceC8733pb1)) ? new C7702mb1(readStrongBinder8) : (InterfaceC8733pb1) queryLocalInterface8;
                }
                boolean b2 = ((BinderC4288cf0) this).a.b(new CustomTabsSessionToken(interfaceC8733pb1, BinderC4288cf0.a((Bundle) AbstractC9761sb1.a(parcel, Bundle.CREATOR))), (Uri) AbstractC9761sb1.a(parcel, Uri.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(b2 ? 1 : 0);
                return true;
            case 12:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
                    interfaceC8733pb1 = (queryLocalInterface9 == null || !(queryLocalInterface9 instanceof InterfaceC8733pb1)) ? new C7702mb1(readStrongBinder9) : (InterfaceC8733pb1) queryLocalInterface9;
                }
                Uri uri3 = (Uri) AbstractC9761sb1.a(parcel, Uri.CREATOR);
                int readInt2 = parcel.readInt();
                CustomTabsSessionToken customTabsSessionToken5 = new CustomTabsSessionToken(interfaceC8733pb1, BinderC4288cf0.a((Bundle) AbstractC9761sb1.a(parcel, Bundle.CREATOR)));
                ((BinderC4288cf0) this).a.i.a.getClass();
                C1061Ie0 c1061Ie0 = (C1061Ie0) C10712vM.e().p.get();
                c1061Ie0.getClass();
                if (uri3 == null) {
                    AbstractC4851eH1.f("CustomTabFiles", "Received a null uri", new Object[0]);
                } else if (readInt2 != 1) {
                    AbstractC4851eH1.f("CustomTabFiles", AbstractC9076qb1.a("Unknown FilePurpose ", readInt2), new Object[0]);
                } else {
                    Bitmap c = AbstractC7974nN0.c(c1061Ie0.a, uri3);
                    if (c != null) {
                        ((C6022hh3) c1061Ie0.b.get()).a.put(customTabsSessionToken5, c);
                        c1061Ie0.c = true;
                        i3 = 1;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
