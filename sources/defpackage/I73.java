package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.Iterator;
import java.util.List;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I73 implements PB, AdapterView.OnItemClickListener {
    public final Activity a;
    public final LargeIconBridge g;
    public final O73 h;
    public final KU3 i;
    public ViewGroup j;
    public C6862k73 k;
    public ScrollView l;
    public int m;
    public Integer n;
    public ZN3 o;

    public static int y(int i) {
        switch (i) {
            case 0:
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return R.string.0_resource_name_obfuscated_res_0x7f1405cd;
            case 1:
                return R.string.0_resource_name_obfuscated_res_0x7f1405cf;
            case 2:
                return R.string.0_resource_name_obfuscated_res_0x7f1405ce;
            case 4:
                return R.string.0_resource_name_obfuscated_res_0x7f1405d1;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return R.string.0_resource_name_obfuscated_res_0x7f1405d2;
            case 6:
                return R.string.0_resource_name_obfuscated_res_0x7f1405d0;
            default:
                return 0;
        }
    }

    @Override // defpackage.PB
    public final int a() {
        return 0;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean d() {
        return false;
    }

    @Override // defpackage.PB
    public final View e() {
        return null;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.PB
    public final int g() {
        return R.string.0_resource_name_obfuscated_res_0x7f140a2c;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.PB
    public final int l() {
        return R.string.0_resource_name_obfuscated_res_0x7f140a2a;
    }

    @Override // defpackage.PB
    public final int m() {
        return -2;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ C8385oa2 o() {
        return OB.a();
    }

    @Override // defpackage.PB
    public final /* synthetic */ void onBackPressed() {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
    }

    @Override // defpackage.PB
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // defpackage.PB
    public final int q() {
        return R.string.0_resource_name_obfuscated_res_0x7f140a26;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // defpackage.PB
    public final int s() {
        return R.string.0_resource_name_obfuscated_res_0x7f140a2b;
    }

    @Override // defpackage.PB
    public final float t() {
        return -1.0f;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // defpackage.PB
    public final boolean v() {
        return true;
    }

    public I73(Activity activity, LargeIconBridge largeIconBridge, O73 o73, C6862k73 c6862k73, KU3 ku3) {
        this.a = activity;
        this.g = largeIconBridge;
        this.h = o73;
        this.k = c6862k73;
        this.i = ku3;
        Boolean bool = c6862k73.k;
        if (bool == null) {
            this.m = 3;
        } else if (bool.booleanValue()) {
            this.m = 1;
            this.n = 0;
        } else {
            this.m = 2;
            this.n = 1;
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0276, (ViewGroup) null);
        this.j = viewGroup;
        this.l = (ScrollView) viewGroup.findViewById(R.id.share_sheet_scrollview);
    }

    public final void A(List list, RecyclerView recyclerView, boolean z) {
        TD2 td2;
        C7616mK1 c7616mK1 = new C7616mK1();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c7616mK1.s(new C7272lK1(0, (PropertyModel) it.next()));
        }
        C4617dc3 c4617dc3 = new C4617dc3(c7616mK1);
        C2591Ty1 c2591Ty1 = new C2591Ty1(R.layout.0_resource_name_obfuscated_res_0x7f0e0277);
        if (z) {
            td2 = new TD2() { // from class: C73
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    I73.i((PropertyModel) wd2, (ViewGroup) obj, (FD2) obj2);
                }
            };
        } else {
            td2 = new TD2() { // from class: D73
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    ViewGroup viewGroup = (ViewGroup) obj;
                    FD2 fd2 = (FD2) obj2;
                    I73.i((PropertyModel) wd2, viewGroup, fd2);
                    if (Q73.a.equals(fd2)) {
                        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.icon);
                        View findViewById = viewGroup.findViewById(R.id.layout);
                        int dimensionPixelSize = V60.a.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080724);
                        int dimensionPixelSize2 = V60.a.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080723);
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        layoutParams.height = dimensionPixelSize;
                        layoutParams.width = dimensionPixelSize;
                        imageView.requestLayout();
                        findViewById.setPadding(0, dimensionPixelSize2, 0, 0);
                    }
                }
            };
        }
        c4617dc3.Q(0, c2591Ty1, td2);
        recyclerView.n0(c4617dc3);
        recyclerView.q0(new LinearLayoutManager(0, false));
    }

    public static void i(PropertyModel propertyModel, ViewGroup viewGroup, FD2 fd2) {
        PD2 pd2 = Q73.a;
        if (pd2.equals(fd2)) {
            ((ImageView) viewGroup.findViewById(R.id.icon)).setImageDrawable((Drawable) propertyModel.i(pd2));
            return;
        }
        PD2 pd22 = Q73.b;
        if (pd22.equals(fd2)) {
            ((TextView) viewGroup.findViewById(R.id.text)).setText((CharSequence) propertyModel.i(pd22));
            return;
        }
        PD2 pd23 = Q73.c;
        if (pd23.equals(fd2)) {
            ((TextView) viewGroup.findViewById(R.id.text)).setContentDescription((CharSequence) propertyModel.i(pd23));
            return;
        }
        PD2 pd24 = Q73.d;
        if (pd24.equals(fd2)) {
            viewGroup.findViewById(R.id.layout).setOnClickListener((View.OnClickListener) propertyModel.i(pd24));
            return;
        }
        LD2 ld2 = Q73.e;
        if (ld2.equals(fd2)) {
            ((TextView) viewGroup.findViewById(R.id.display_new)).setVisibility(propertyModel.j(ld2) ? 0 : 8);
        }
    }

    public final void C(int i) {
        ZN3 zn3 = this.o;
        if (zn3 != null) {
            zn3.a();
        }
        Activity activity = this.a;
        ZN3 c = ZN3.c(activity, activity.getResources().getString(i), 0);
        this.o = c;
        Toast toast = c.a;
        toast.setGravity(toast.getGravity(), this.o.a.getXOffset(), activity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08084f));
        this.o.d();
    }

    public final void w(ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080725);
        imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:            if (r6.equals("image") == false) goto L143;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String z(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "/"
            boolean r1 = r6.contains(r0)
            java.lang.String r2 = ""
            if (r1 != 0) goto Lb
            return r2
        Lb:
            r1 = 2
            java.lang.String[] r6 = r6.split(r0, r1)
            r0 = 0
            r6 = r6[r0]
            r6.getClass()
            int r3 = r6.hashCode()
            r4 = -1
            switch(r3) {
                case 3556653: goto L3f;
                case 93166550: goto L34;
                case 100313435: goto L2b;
                case 112202875: goto L20;
                default: goto L1e;
            }
        L1e:
            r1 = r4
            goto L49
        L20:
            java.lang.String r0 = "video"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L29
            goto L1e
        L29:
            r1 = 3
            goto L49
        L2b:
            java.lang.String r0 = "image"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L49
            goto L1e
        L34:
            java.lang.String r0 = "audio"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L3d
            goto L1e
        L3d:
            r1 = 1
            goto L49
        L3f:
            java.lang.String r1 = "text"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L48
            goto L1e
        L48:
            r1 = r0
        L49:
            android.app.Activity r6 = r5.a
            switch(r1) {
                case 0: goto L73;
                case 1: goto L67;
                case 2: goto L5b;
                case 3: goto L4f;
                default: goto L4e;
            }
        L4e:
            return r2
        L4f:
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2132019759(0x7f140a2f, float:1.9677862E38)
            java.lang.String r6 = r6.getString(r0)
            return r6
        L5b:
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2132019751(0x7f140a27, float:1.9677846E38)
            java.lang.String r6 = r6.getString(r0)
            return r6
        L67:
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2132019749(0x7f140a25, float:1.9677842E38)
            java.lang.String r6 = r6.getString(r0)
            return r6
        L73:
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2132019758(0x7f140a2e, float:1.967786E38)
            java.lang.String r6 = r6.getString(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I73.z(java.lang.String):java.lang.String");
    }

    public final void B(Drawable drawable) {
        ImageView imageView = (ImageView) this.j.findViewById(R.id.image_preview);
        imageView.setImageDrawable(drawable);
        w(imageView);
    }

    @Override // defpackage.PB
    public final View c() {
        return this.j;
    }

    public final void x(List list) {
        RecyclerView recyclerView = (RecyclerView) this.j.findViewById(R.id.share_sheet_chrome_apps);
        if (list == null || list.size() <= 0) {
            return;
        }
        this.j.findViewById(R.id.share_sheet_divider).setVisibility(0);
        recyclerView.setVisibility(0);
        A(list, recyclerView, true);
        recyclerView.i(new H73("SharingHubAndroid.FirstPartyAppsScrolled"));
    }

    @Override // defpackage.PB
    public final int b() {
        ScrollView scrollView = this.l;
        if (scrollView != null) {
            return scrollView.getScrollY();
        }
        return 0;
    }

    @Override // defpackage.PB
    public final void destroy() {
        InterfaceC6518j73 interfaceC6518j73;
        ZN3 zn3 = this.o;
        if (zn3 != null) {
            zn3.a();
        }
        O73 o73 = this.h;
        C6862k73 c6862k73 = o73.v;
        if (c6862k73 != null && (interfaceC6518j73 = c6862k73.n) != null) {
            interfaceC6518j73.onCancel();
        }
        WindowAndroid windowAndroid = o73.x;
        if (windowAndroid != null) {
            windowAndroid.w.d(o73);
            o73.x = null;
        }
        I5 i5 = o73.t;
        if (i5 != null) {
            i5.c(o73);
            o73.t = null;
        }
        QB qb = o73.a;
        if (qb != null) {
            ((m) qb).o(o73.k);
        }
    }
}
