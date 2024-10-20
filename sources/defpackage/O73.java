package defpackage;

import J.N;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.browser_ui.widget.RoundedCornerImageView;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class O73 implements InterfaceC4009bp4, QO, T20, View.OnLayoutChangeListener {
    public R73 A;
    public final C5494g83 B;
    public int C = 3;
    public S73 D = new S73(2, 0);
    public final QB a;
    public final InterfaceC0079Ap3 g;
    public final Callback h;
    public final boolean i;
    public final InterfaceC10140th1 j;
    public final N73 k;
    public final LargeIconBridge l;
    public final KU3 m;
    public final InterfaceC0079Ap3 n;
    public long o;
    public boolean p;
    public boolean q;
    public HashSet r;
    public Activity s;
    public I5 t;
    public CP u;
    public C6862k73 v;
    public I73 w;
    public WindowAndroid x;
    public EP y;
    public C5858hC1 z;

    @Override // defpackage.InterfaceC4009bp4
    public final void a() {
    }

    @Override // defpackage.InterfaceC4009bp4
    public final void d() {
    }

    public O73(QB qb, I5 i5, InterfaceC0079Ap3 interfaceC0079Ap3, C3776b83 c3776b83, F63 f63, LargeIconBridge largeIconBridge, boolean z, InterfaceC10140th1 interfaceC10140th1, KU3 ku3, InterfaceC0079Ap3 interfaceC0079Ap32) {
        this.a = qb;
        this.t = i5;
        i5.b(this);
        this.g = interfaceC0079Ap3;
        this.h = f63;
        this.i = z;
        this.j = interfaceC10140th1;
        N73 n73 = new N73(this);
        this.k = n73;
        ((m) qb).a(n73);
        this.l = largeIconBridge;
        this.m = ku3;
        this.n = interfaceC0079Ap32;
        this.B = new C5494g83(qb, this.w, this.o, this.C, this.D, c3776b83, interfaceC0079Ap32);
    }

    public final String h(C6862k73 c6862k73, EP ep) {
        if (!TextUtils.isEmpty(c6862k73.e)) {
            return c6862k73.e;
        }
        if (!ep.d.k()) {
            return ep.d.i();
        }
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.g;
        return (interfaceC0079Ap3.i() && ((Tab) interfaceC0079Ap3.get()).isInitialized()) ? ((Tab) interfaceC0079Ap3.get()).getUrl().i() : "";
    }

    public final boolean k(EP ep) {
        InterfaceC0079Ap3 interfaceC0079Ap3;
        return ep.j == 3 && (interfaceC0079Ap3 = this.g) != null && interfaceC0079Ap3.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [J73] */
    public final void m(C6862k73 c6862k73, EP ep, long j) {
        this.v = c6862k73;
        this.y = ep;
        this.s = (Activity) c6862k73.a.k().get();
        if (!k(ep)) {
            this.A.b(c6862k73, ep);
            R73 r73 = this.A;
            int i = r73.c.j;
            this.v = r73.a(((i == 3 || i == 5 || i == 6) ? 1 : 0) ^ 1);
        }
        if (this.s == null) {
            return;
        }
        if (this.x == null) {
            WindowAndroid windowAndroid = c6862k73.a;
            this.x = windowAndroid;
            if (windowAndroid != null) {
                windowAndroid.w.a(this);
            }
        }
        I73 i73 = new I73(this.s, this.l, this, c6862k73, this.m);
        this.w = i73;
        this.o = j;
        this.C = i73.m;
        n(new Runnable() { // from class: J73
            @Override // java.lang.Runnable
            public final void run() {
                O73 o73 = O73.this;
                if (((m) o73.a).p(o73.w, true)) {
                    EI2.k(System.currentTimeMillis() - o73.o, "Sharing.SharingHubAndroid.TimeToShowShareSheet");
                }
            }
        });
    }

    public final void o(S73 s73, int i) {
        if (this.z == null && this.A == null) {
            return;
        }
        C6862k73 a = this.A.a(s73.a);
        this.v = a;
        this.w.k = a;
        this.C = i;
        this.D = s73;
        n(null);
    }

    /* JADX WARN: Type inference failed for: r12v13, types: [d83] */
    /* JADX WARN: Type inference failed for: r4v2, types: [L73, org.chromium.base.Callback] */
    public final void n(final J73 j73) {
        final O73 o73;
        final ArrayList a;
        C6862k73 c6862k73 = this.v;
        EP ep = this.y;
        int i = C3776b83.d;
        HashSet hashSet = new HashSet();
        boolean z = !TextUtils.isEmpty(c6862k73.e);
        if (z && !ep.h) {
            if (ep.c) {
                hashSet.add(0);
            } else {
                hashSet.add(1);
            }
        }
        if (!TextUtils.isEmpty(c6862k73.a())) {
            if (ep.j == 3) {
                hashSet.add(3);
            } else {
                hashSet.add(2);
            }
        }
        if (z && !TextUtils.isEmpty(c6862k73.a())) {
            hashSet.add(4);
        }
        if (c6862k73.g != null) {
            String str = c6862k73.f;
            if (TextUtils.isEmpty(str) || !str.startsWith("image/")) {
                hashSet.add(6);
            } else if (z) {
                hashSet.add(7);
            } else {
                hashSet.add(5);
            }
        }
        this.r = hashSet;
        Activity activity = this.s;
        C6862k73 c6862k732 = this.v;
        EP ep2 = this.y;
        if (this.p) {
            a = new ArrayList();
            o73 = this;
        } else {
            o73 = this;
            o73.u = new CP(activity, this.x, this.g, this.a, this.w, c6862k732, this.h, this.i, this.o, this, this.j, this.m, h(c6862k732, ep2), this.C, this.D, this.n);
            boolean f = AbstractC9771sd.f(activity);
            o73.q = f;
            a = o73.u.a(hashSet, ep2.j, f);
        }
        final Activity activity2 = o73.s;
        final C6862k73 c6862k733 = o73.v;
        HashSet hashSet2 = o73.r;
        final boolean z2 = o73.y.a;
        final ?? r4 = new Callback() { // from class: L73
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                List list;
                boolean z3;
                int y;
                int i2;
                int i3;
                List list2 = (List) obj;
                O73 o732 = O73.this;
                final I73 i73 = o732.w;
                HashSet hashSet3 = o732.r;
                String str2 = o732.v.f;
                final int i4 = o732.y.j;
                R73 r73 = o732.A;
                C6862k73 c6862k734 = i73.k;
                String str3 = c6862k734.b;
                String MeroQv$e = N.MeroQv$e(c6862k734.e);
                boolean contains = hashSet3.contains(5);
                Activity activity3 = i73.a;
                if (contains || hashSet3.contains(7)) {
                    new C3426a73(activity3, (Uri) i73.k.g.get(0), new Callback() { // from class: E73
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj2) {
                            return new ZE(this, obj2);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj2) {
                            Bitmap bitmap = (Bitmap) obj2;
                            I73 i732 = I73.this;
                            if (bitmap == null) {
                                i732.getClass();
                                return;
                            }
                            RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) i732.j.findViewById(R.id.image_preview);
                            roundedCornerImageView.setImageBitmap(bitmap);
                            int c = AbstractC10957w33.c(i732.a);
                            roundedCornerImageView.p = c;
                            roundedCornerImageView.k.setColor(c);
                            roundedCornerImageView.invalidate();
                            roundedCornerImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        }
                    }).c(AbstractC0185Bl.e);
                    if (TextUtils.isEmpty(MeroQv$e)) {
                        MeroQv$e = i73.z(str2);
                    }
                } else if (hashSet3.contains(6)) {
                    i73.B(AbstractC2884Wf.a(activity3, R.drawable.f46430_resource_name_obfuscated_res_0x7f090183));
                    if (TextUtils.isEmpty(MeroQv$e)) {
                        MeroQv$e = i73.z(str2);
                    }
                } else if (hashSet3.size() == 1 && (hashSet3.contains(3) || hashSet3.contains(2))) {
                    i73.B(AbstractC2884Wf.a(activity3, R.drawable.f53810_resource_name_obfuscated_res_0x7f0904c2));
                    MeroQv$e = i73.k.a();
                    ((TextView) i73.j.findViewById(R.id.subtitle_preview)).setMaxLines(2);
                    str3 = "";
                } else {
                    String str4 = i73.k.e;
                    if (!str4.isEmpty()) {
                        i73.g.b(new GURL(str4), activity3.getResources().getDimensionPixelSize(R.dimen.f30470_resource_name_obfuscated_res_0x7f080179), new LargeIconBridge.LargeIconCallback() { // from class: F73
                            @Override // org.chromium.components.favicon.LargeIconBridge.LargeIconCallback
                            public final void onLargeIconAvailable(Bitmap bitmap, int i5, boolean z4, int i6) {
                                I73 i732 = I73.this;
                                Activity activity4 = i732.a;
                                if (bitmap == null) {
                                    i732.B(AbstractC2884Wf.a(activity4, R.drawable.f46420_resource_name_obfuscated_res_0x7f090182));
                                    FI2.a("SharingHubAndroid.GenericFaviconShown");
                                    return;
                                }
                                int dimensionPixelSize = activity4.getResources().getDimensionPixelSize(R.dimen.f40180_resource_name_obfuscated_res_0x7f080728);
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, dimensionPixelSize, dimensionPixelSize, true);
                                ImageView imageView = (ImageView) i732.j.findViewById(R.id.image_preview);
                                imageView.setImageBitmap(createScaledBitmap);
                                i732.w(imageView);
                                FI2.a("SharingHubAndroid.LinkFaviconShown");
                            }
                        });
                    }
                }
                if (r73.e || r73.f) {
                    if (i73.n == null) {
                        int i5 = r73.c.j;
                        i73.n = Integer.valueOf(((i5 == 3 || i5 == 5 || i5 == 6) ? 1 : 0) ^ 1);
                    }
                    if (i73.n.intValue() == 0) {
                        i2 = R.drawable.f51060_resource_name_obfuscated_res_0x7f09036e;
                        i3 = R.color.f17710_resource_name_obfuscated_res_0x7f070113;
                        y = R.string.f76440_resource_name_obfuscated_res_0x7f1405cb;
                    } else {
                        y = I73.y(i4);
                        i2 = R.drawable.f51070_resource_name_obfuscated_res_0x7f09036f;
                        i3 = R.color.f17870_resource_name_obfuscated_res_0x7f07012b;
                    }
                    if (i4 == 3) {
                        int i6 = i73.m;
                        if (i6 == 1) {
                            y = R.string.f76420_resource_name_obfuscated_res_0x7f1405c9;
                        } else if (i6 == 0) {
                            y = R.string.f76430_resource_name_obfuscated_res_0x7f1405ca;
                        } else if (i6 == 2) {
                            y = R.string.f76410_resource_name_obfuscated_res_0x7f1405c8;
                        }
                    }
                    ImageView imageView = (ImageView) i73.j.findViewById(R.id.link_toggle_view);
                    imageView.setColorFilter(Y50.b(activity3, i3).getDefaultColor());
                    imageView.setVisibility(0);
                    imageView.setImageDrawable(AbstractC2884Wf.a(activity3, i2));
                    imageView.setContentDescription(null);
                    imageView.setContentDescription(activity3.getResources().getString(y));
                    i73.w(imageView);
                    if (i73.n.intValue() == 1) {
                        View findViewById = i73.j.findViewById(R.id.link_toggle_view);
                        int i7 = -activity3.getResources().getDimensionPixelOffset(R.dimen.f42220_resource_name_obfuscated_res_0x7f0807fb);
                        Rect rect = new Rect(0, i7, 0, i7);
                        Q44 q44 = new Q44(activity3, new Handler(Looper.getMainLooper()));
                        list = list2;
                        C12180ze1 c12180ze1 = new C12180ze1(activity3.getResources(), "IPH_SharingHubLinkToggle", R.string.f76450_resource_name_obfuscated_res_0x7f1405cc, R.string.f76450_resource_name_obfuscated_res_0x7f1405cc);
                        c12180ze1.h = findViewById;
                        c12180ze1.o = new Yc4(1);
                        c12180ze1.l = rect;
                        c12180ze1.r = 2;
                        q44.a(c12180ze1.a());
                    } else {
                        list = list2;
                    }
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: G73
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int y2;
                            String str5;
                            I73 i732 = I73.this;
                            i732.i.notifyEvent("sharing_hub_link_toggle_clicked");
                            int i8 = 0;
                            int i9 = i4;
                            O73 o733 = i732.h;
                            if (i9 != 3) {
                                if (i732.n.intValue() == 1) {
                                    i732.n = 0;
                                    y2 = R.string.f76440_resource_name_obfuscated_res_0x7f1405cb;
                                } else {
                                    i732.n = 1;
                                    y2 = I73.y(i9);
                                }
                                i732.C(y2);
                                S73 s73 = new S73(i732.n.intValue(), i9);
                                T73.a(s73, "InProgress");
                                o733.o(s73, i732.m);
                                return;
                            }
                            int i10 = i732.m;
                            if (i10 == 1) {
                                i732.m = 0;
                                i732.n = 1;
                                i8 = R.string.f76430_resource_name_obfuscated_res_0x7f1405ca;
                                str5 = "SharingHubAndroid.LinkGeneration.Text";
                            } else if (i10 == 0) {
                                i732.m = 1;
                                i732.n = 0;
                                i8 = R.string.f76420_resource_name_obfuscated_res_0x7f1405c9;
                                str5 = "SharingHubAndroid.LinkGeneration.Link";
                            } else if (i10 == 2) {
                                i732.n = 1;
                                i8 = R.string.f76410_resource_name_obfuscated_res_0x7f1405c8;
                                str5 = "SharingHubAndroid.LinkGeneration.Failure";
                            } else {
                                str5 = "";
                            }
                            i732.C(i8);
                            FI2.a(str5);
                            o733.o(new S73(i732.n.intValue(), 3), i732.m);
                        }
                    });
                } else {
                    list = list2;
                }
                if ((hashSet3.contains(2) || hashSet3.contains(3)) && hashSet3.contains(1)) {
                    C6862k73 c6862k735 = i73.k;
                    String str5 = c6862k735.l;
                    String str6 = c6862k735.m;
                    if (str6 != null) {
                        str5 = String.format(str6, str5);
                    }
                    C6862k73 c6862k736 = i73.k;
                    if (str5 != null) {
                        String str7 = c6862k736.l;
                        String str8 = c6862k736.m;
                        if (str8 != null) {
                            str7 = String.format(str8, str7);
                        }
                        str3 = str7;
                    } else {
                        str3 = c6862k736.a();
                    }
                    AbstractC9771sd.i(R.style.f102720_resource_name_obfuscated_res_0x7f15044d, (TextView) i73.j.findViewById(R.id.title_preview));
                    ((TextView) i73.j.findViewById(R.id.subtitle_preview)).setMaxLines(1);
                } else if (!TextUtils.isEmpty(str3)) {
                    AbstractC9771sd.i(R.style.f102870_resource_name_obfuscated_res_0x7f15045c, (TextView) i73.j.findViewById(R.id.title_preview));
                }
                TextView textView = (TextView) i73.j.findViewById(R.id.title_preview);
                textView.setText(str3);
                ((TextView) i73.j.findViewById(R.id.subtitle_preview)).setText(MeroQv$e);
                if (TextUtils.isEmpty(str3)) {
                    textView.setVisibility(8);
                    z3 = false;
                } else {
                    z3 = false;
                    textView.setVisibility(0);
                }
                i73.x(a);
                RecyclerView recyclerView = (RecyclerView) i73.j.findViewById(R.id.share_sheet_other_apps);
                i73.A(list, (RecyclerView) i73.j.findViewById(R.id.share_sheet_other_apps), z3);
                recyclerView.i(new H73("SharingHubAndroid.ThirdPartyAppsScrolled"));
                Runnable runnable = j73;
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        if (c6862k733 != null) {
            final C5494g83 c5494g83 = o73.B;
            Profile profile = (Profile) c5494g83.c.get();
            String str2 = hashSet2.contains(5) ? "image" : "other";
            PackageManager packageManager = V60.a.getPackageManager();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(N63.b(), 0);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.addFlags(524288);
            intent.setType(c6862k733.f);
            queryIntentActivities.addAll(packageManager.queryIntentActivities(intent, 0));
            ArrayList arrayList = new ArrayList();
            final HashMap hashMap = new HashMap();
            String packageName = V60.a.getPackageName();
            ArrayList arrayList2 = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (!resolveInfo.activityInfo.packageName.equals(packageName)) {
                    arrayList2.add(resolveInfo);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ResolveInfo resolveInfo2 = (ResolveInfo) it.next();
                if (!C5494g83.h.contains(resolveInfo2.activityInfo.packageName)) {
                    arrayList3.add(resolveInfo2);
                }
            }
            Collections.sort(arrayList3, new C5150f83());
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ResolveInfo resolveInfo3 = (ResolveInfo) it2.next();
                String str3 = resolveInfo3.activityInfo.packageName + "/" + resolveInfo3.activityInfo.name;
                arrayList.add(str3);
                hashMap.put(str3, resolveInfo3);
            }
            int i2 = V60.a.getResources().getDisplayMetrics().widthPixels;
            int dimensionPixelSize = activity2.getResources().getDimensionPixelSize(R.dimen.f40200_resource_name_obfuscated_res_0x7f08072a);
            int dimensionPixelSize2 = activity2.getResources().getDimensionPixelSize(R.dimen.f40190_resource_name_obfuscated_res_0x7f080729) * 2;
            int i3 = (i2 - dimensionPixelSize2) / (dimensionPixelSize + dimensionPixelSize2);
            boolean z3 = !profile.i() && z2;
            final ?? r12 = new Callback() { // from class: d83
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C6862k73 c6862k734;
                    ResolveInfo resolveInfo4;
                    Drawable loadIcon;
                    int iconResource;
                    final C6862k73 c6862k735 = c6862k733;
                    final boolean z4 = z2;
                    final C5494g83 c5494g832 = C5494g83.this;
                    c5494g832.getClass();
                    ArrayList arrayList4 = new ArrayList();
                    for (String str4 : (List) obj) {
                        if (!str4.equals("$more")) {
                            if (!str4.equals("")) {
                                final I73 i73 = c5494g832.d;
                                final ResolveInfo resolveInfo5 = (ResolveInfo) hashMap.get(str4);
                                final long j = c5494g832.e;
                                final int i4 = c5494g832.f;
                                final S73 s73 = c5494g832.g;
                                final C3776b83 c3776b83 = c5494g832.b;
                                c3776b83.getClass();
                                final C6862k73 c6862k736 = c6862k735;
                                c6862k734 = c6862k735;
                                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: a83
                                    public final /* synthetic */ int k = -1;

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        long j2 = j;
                                        int i5 = i4;
                                        S73 s732 = s73;
                                        C3776b83 c3776b832 = C3776b83.this;
                                        c3776b832.getClass();
                                        ActivityInfo activityInfo = resolveInfo5.activityInfo;
                                        int i6 = this.k;
                                        if (i6 >= 0) {
                                            EI2.h(i6, 8, "Sharing.SharingHubAndroid.ThirdPartyAppUsage");
                                        }
                                        O73.j("SharingHubAndroid.ThirdPartyAppSelected", i5, s732, j2, c3776b832.c);
                                        ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                                        C6862k73 c6862k737 = c6862k736;
                                        InterfaceC6518j73 interfaceC6518j73 = c6862k737.n;
                                        if (interfaceC6518j73 != null) {
                                            interfaceC6518j73.a(componentName);
                                            c6862k737.n = null;
                                        }
                                        if (z4) {
                                            O83.a.t("Chrome.Sharing.LastSharedComponentName", componentName.flattenToString());
                                            Profile profile2 = c3776b832.c;
                                            if (profile2 != null) {
                                                N.MtTgEuiL(profile2, componentName.flattenToString());
                                            }
                                        }
                                        ((m) c3776b832.a).l(i73, true, 0);
                                        O63.h(c6862k737, componentName);
                                    }
                                };
                                PackageManager packageManager2 = c3776b83.b;
                                try {
                                    iconResource = resolveInfo5.getIconResource();
                                } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused) {
                                }
                                if (iconResource != 0) {
                                    resolveInfo4 = resolveInfo5;
                                    try {
                                        loadIcon = AbstractC9771sd.c(packageManager2.getResourcesForApplication(resolveInfo4.activityInfo.packageName), iconResource, 0);
                                    } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused2) {
                                    }
                                    arrayList4.add(C3776b83.a(loadIcon, (String) resolveInfo4.loadLabel(packageManager2), null, onClickListener, false));
                                    c6862k735 = c6862k734;
                                }
                                resolveInfo4 = resolveInfo5;
                                loadIcon = resolveInfo4.loadIcon(packageManager2);
                                arrayList4.add(C3776b83.a(loadIcon, (String) resolveInfo4.loadLabel(packageManager2), null, onClickListener, false));
                                c6862k735 = c6862k734;
                            }
                        } else {
                            Activity activity3 = activity2;
                            arrayList4.add(C3776b83.a(AbstractC2884Wf.a(activity3, R.drawable.f53350_resource_name_obfuscated_res_0x7f090493), activity3.getResources().getString(R.string.f86700_resource_name_obfuscated_res_0x7f140a38), null, new View.OnClickListener() { // from class: e83
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C5494g83 c5494g833 = C5494g83.this;
                                    Profile profile2 = (Profile) c5494g833.c.get();
                                    O73.j("SharingHubAndroid.MoreSelected", c5494g833.f, c5494g833.g, c5494g833.e, profile2);
                                    ((m) c5494g833.a).l(c5494g833.d, true, 0);
                                    C6862k73 c6862k737 = c6862k735;
                                    O63.i(c6862k737, profile2, z4);
                                    c6862k737.n = null;
                                }
                            }, false));
                        }
                        c6862k734 = c6862k735;
                        c6862k735 = c6862k734;
                    }
                    PostTask.c(AbstractC5103f04.a, r4.e0(arrayList4));
                }
            };
            N.MvxJx5iS(profile, str2, arrayList.toArray(), i3, i3, z3, new Callback() { // from class: l73
                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    r12.onResult(Arrays.asList((String[]) obj));
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }
            });
            return;
        }
        PostTask.c(AbstractC5103f04.a, new ZE(r4, null));
    }

    /* JADX WARN: Type inference failed for: r14v7, types: [bC1] */
    public final void l(C6862k73 c6862k73, EP ep, long j) {
        if (k(ep)) {
            if (!ep.g) {
                EI2.h(0, 3, "SharedHighlights.LinkToTextDiagnoseStatus");
            }
            this.z = new C5858hC1((Tab) this.g.get(), this, ep, j, h(c6862k73, ep), c6862k73.a());
        }
        this.A = new R73(c6862k73, ep, this.z);
        if (k(ep)) {
            final C5858hC1 c5858hC1 = this.z;
            if (c5858hC1.h.g) {
                c5858hC1.Y0();
                if (c5858hC1.k == null) {
                    c5858hC1.W0(1);
                    return;
                }
                QF3 qf3 = AbstractC5103f04.a;
                Runnable runnable = new Runnable() { // from class: aC1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5858hC1 c5858hC12 = C5858hC1.this;
                        if (c5858hC12.o == 1) {
                            if (c5858hC12.h.g) {
                                c5858hC12.W0(5);
                            } else {
                                c5858hC12.V0(11);
                            }
                        }
                    }
                };
                C7928nE c7928nE = UN.a;
                PostTask.b(qf3, runnable, N.M37SqSAy("PreemptiveLinkToTextGeneration", "TimeoutLengthMs", 100));
                c5858hC1.o = 1;
                ((C4515dI3) c5858hC1.k).c(new C6888kC1(new Callback() { // from class: bC1
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        String[] strArr = (String[]) obj;
                        final C5858hC1 c5858hC12 = C5858hC1.this;
                        c5858hC12.getClass();
                        StringBuilder sb = new StringBuilder();
                        if (strArr.length > 0) {
                            sb.append((CharSequence) strArr[0]);
                            for (int i = 1; i < strArr.length; i++) {
                                sb.append((CharSequence) ",");
                                sb.append((CharSequence) strArr[i]);
                            }
                        }
                        c5858hC12.l = sb.toString();
                        Tab tab = c5858hC12.g;
                        Callback callback = new Callback() { // from class: dC1
                            @Override // org.chromium.base.Callback
                            public final ZE e0(Object obj2) {
                                return new ZE(this, obj2);
                            }

                            @Override // org.chromium.base.Callback
                            public final void onResult(Object obj2) {
                                final String str = (String) obj2;
                                final C5858hC1 c5858hC13 = C5858hC1.this;
                                if (c5858hC13.o == 3) {
                                    return;
                                }
                                if (str.isEmpty()) {
                                    c5858hC13.W0(6);
                                } else {
                                    AbstractC8264oC1.c(new Callback() { // from class: gC1
                                        @Override // org.chromium.base.Callback
                                        public final ZE e0(Object obj3) {
                                            return new ZE(this, obj3);
                                        }

                                        @Override // org.chromium.base.Callback
                                        public final void onResult(Object obj3) {
                                            String str2 = (String) obj3;
                                            C5858hC1 c5858hC14 = C5858hC1.this;
                                            c5858hC14.getClass();
                                            if (!str2.isEmpty()) {
                                                c5858hC14.j = str2;
                                            }
                                            if (c5858hC14.o == 3) {
                                                return;
                                            }
                                            c5858hC14.o = 2;
                                            if (!c5858hC14.h.g) {
                                                N.MNJqVjyt(c5858hC14.g.b());
                                            } else {
                                                N.MwdUorUl(0);
                                            }
                                            c5858hC14.X0(str);
                                            D30 d30 = c5858hC14.k;
                                            if (d30 != null) {
                                                ((AbstractC6411ip1) d30).close();
                                            }
                                            c5858hC14.g.w(c5858hC14);
                                        }
                                    }, c5858hC13.g);
                                }
                            }
                        };
                        AbstractC8264oC1.a(new ArrayList(), tab.b().O().c(), callback, 0);
                    }
                }));
                return;
            }
            if (!N.MnwPB_N7(new GURL(c5858hC1.j))) {
                c5858hC1.V0(12);
                return;
            }
            if (c5858hC1.g.b().O() != c5858hC1.g.b().P0()) {
                C7928nE c7928nE2 = UN.a;
                if (!N.M09VlOh_("SharedHighlightingAmp") || !N.Mt2IgP1o(new GURL(c5858hC1.j))) {
                    c5858hC1.V0(10);
                    return;
                }
            }
            QF3 qf32 = AbstractC5103f04.a;
            Runnable runnable2 = new Runnable() { // from class: cC1
                @Override // java.lang.Runnable
                public final void run() {
                    C5858hC1 c5858hC12 = C5858hC1.this;
                    if (c5858hC12.o == 1) {
                        if (c5858hC12.h.g) {
                            c5858hC12.W0(5);
                        } else {
                            c5858hC12.V0(11);
                        }
                    }
                }
            };
            C7928nE c7928nE3 = UN.a;
            PostTask.b(qf32, runnable2, N.M37SqSAy("PreemptiveLinkToTextGeneration", "TimeoutLengthMs", 100));
            EI2.h(1, 3, "SharedHighlights.LinkToTextDiagnoseStatus");
            c5858hC1.Y0();
            InterfaceC3828bI3 interfaceC3828bI3 = c5858hC1.k;
            if (interfaceC3828bI3 == null) {
                c5858hC1.V0(13);
                return;
            }
            c5858hC1.o = 1;
            ((C4515dI3) interfaceC3828bI3).f(new C7920nC1(new C4826eC1(c5858hC1)));
            return;
        }
        m(c6862k73, ep, j);
    }

    public static void j(String str, int i, S73 s73, long j, Profile profile) {
        FI2.a(str);
        if (i != 3) {
            if (i == 0) {
                FI2.a("SharingHubAndroid.LinkGeneration.Success.TextShared");
            } else if (i == 1) {
                FI2.a("SharingHubAndroid.LinkGeneration.Success.LinkToTextShared");
            } else if (i == 2) {
                FI2.a("SharingHubAndroid.LinkGeneration.Failure.TextShared");
            }
            EI2.h(i, 3, "SharedHighlights.AndroidShareSheet.SharedState");
        }
        if (i == 1 || i == 0) {
            LU3.a(profile).notifyEvent("iph_shared_highlighting_used");
        }
        T73.a(s73, "Completed");
        EI2.k(System.currentTimeMillis() - j, "Sharing.SharingHubAndroid.TimeToShare");
    }

    @Override // defpackage.InterfaceC4009bp4
    public final void b() {
        C7928nE c7928nE = UN.a;
        boolean M09VlOh_ = N.M09VlOh_("PersistShareHubOnAppSwitch");
        I73 i73 = this.w;
        if (i73 == null || M09VlOh_) {
            return;
        }
        ((m) this.a).l(i73, true, 0);
    }

    @Override // defpackage.T20
    public final void onConfigurationChanged(Configuration configuration) {
        boolean f;
        HashSet hashSet;
        Activity activity = this.s;
        if (activity == null || this.q == (f = AbstractC9771sd.f(activity)) || (hashSet = this.r) == null) {
            return;
        }
        this.q = f;
        this.w.x(this.u.a(hashSet, this.y.j, f));
        ((m) this.a).p(this.w, false);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i7 - i5 == i3 - i) {
            return;
        }
        this.w.j.findViewById(R.id.share_sheet_chrome_apps).invalidate();
        this.w.j.findViewById(R.id.share_sheet_chrome_apps).requestLayout();
        this.w.j.findViewById(R.id.share_sheet_other_apps).invalidate();
        this.w.j.findViewById(R.id.share_sheet_other_apps).requestLayout();
    }
}
