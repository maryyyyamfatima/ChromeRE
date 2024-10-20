package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.download.DownloadUtils;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class WO3 implements InterfaceC11456xX2, InterfaceC3657ao2 {
    public final C10452uc0 a;
    public final Activity g;
    public final WindowAndroid h;
    public final I5 i;
    public final C11113wX2 j;
    public final Handler k;
    public final View l;
    public final View m;
    public final C1340Ki n;
    public final Q44 o;
    public final InterfaceC7697ma2 p;
    public final InterfaceC0079Ap3 q;

    public WO3(a aVar, C10285u6 c10285u6, C0430Di c0430Di, I5 i5, C6166i6 c6166i6, InterfaceC0079Ap3 interfaceC0079Ap3, ImageButton imageButton, View view) {
        Handler handler = new Handler();
        this.k = handler;
        this.g = aVar;
        this.h = c10285u6;
        this.n = c0430Di.d;
        this.l = imageButton;
        this.m = view;
        this.q = interfaceC0079Ap3;
        this.o = new Q44(aVar, handler);
        this.j = new C11113wX2(this);
        this.i = i5;
        i5.b(this);
        this.p = c6166i6;
        this.a = new C10452uc0(c6166i6, new VO3(this), null);
        AbstractC9664sI0.b(3, new Runnable() { // from class: LO3
            @Override // java.lang.Runnable
            public final void run() {
                final WO3 wo3 = WO3.this;
                C12180ze1 c12180ze1 = new C12180ze1(wo3.g.getResources(), "IPH_FeatureNotificationGuideIncognitoTabHelpBubble", R.string.0_resource_name_obfuscated_res_0x7f140497, R.string.0_resource_name_obfuscated_res_0x7f140497);
                c12180ze1.h = wo3.l;
                c12180ze1.i = new Runnable() { // from class: SO3
                    @Override // java.lang.Runnable
                    public final void run() {
                        WO3.this.d(Integer.valueOf(R.id.new_incognito_tab_menu_id));
                    }
                };
                c12180ze1.k = new NO3(wo3);
                wo3.o.a(c12180ze1.a());
            }
        });
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void c() {
        if (DeviceFormFactor.b(this.h)) {
            return;
        }
        C11113wX2 c11113wX2 = this.j;
        c11113wX2.getClass();
        Object obj = ThreadUtils.a;
        V60.a.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, c11113wX2.b);
        c11113wX2.c = true;
        this.k.post(new Runnable() { // from class: OO3
            @Override // java.lang.Runnable
            public final void run() {
                final WO3 wo3 = WO3.this;
                wo3.getClass();
                C11119wY3 c11119wY3 = AbstractC10107tb4.a;
                if (c11119wY3.a == 3) {
                    final Integer valueOf = Integer.valueOf(DownloadUtils.f((Tab) ((C8385oa2) wo3.p).g) ? R.id.offline_page_id : R.id.downloads_menu_id);
                    C12180ze1 c12180ze1 = new C12180ze1(wo3.g.getResources(), null, R.string.0_resource_name_obfuscated_res_0x7f140ba2, R.string.0_resource_name_obfuscated_res_0x7f140ba2);
                    c12180ze1.h = wo3.l;
                    c12180ze1.i = new Runnable() { // from class: TO3
                        @Override // java.lang.Runnable
                        public final void run() {
                            WO3.this.d(valueOf);
                        }
                    };
                    c12180ze1.k = new NO3(wo3);
                    wo3.o.a(c12180ze1.a());
                    c11119wY3.a = 0;
                }
            }
        });
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void e() {
        C11113wX2 c11113wX2 = this.j;
        c11113wX2.getClass();
        Object obj = ThreadUtils.a;
        c11113wX2.c = false;
        C10770vX2 c10770vX2 = c11113wX2.b;
        if (c10770vX2 == null) {
            return;
        }
        V60.a.getContentResolver().unregisterContentObserver(c10770vX2);
    }

    public final void b(Tab tab, String str) {
        if (tab == null || DeviceFormFactor.b(this.h)) {
            return;
        }
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.q;
        if ((interfaceC0079Ap3.get() == null || !((Boolean) interfaceC0079Ap3.get()).booleanValue()) && DownloadUtils.f(tab)) {
            C12180ze1 c12180ze1 = new C12180ze1(this.g.getResources(), str, R.string.0_resource_name_obfuscated_res_0x7f140548, R.string.0_resource_name_obfuscated_res_0x7f140547);
            c12180ze1.i = new Runnable() { // from class: PO3
                @Override // java.lang.Runnable
                public final void run() {
                    WO3.this.d(Integer.valueOf(R.id.offline_page_id));
                }
            };
            c12180ze1.k = new NO3(this);
            c12180ze1.h = this.l;
            this.o.a(c12180ze1.a());
            GX2 V0 = GX2.V0(tab);
            if (V0 == null || V0.a <= 0) {
                return;
            }
            V0.g = 2;
        }
    }

    public final void d(Integer num) {
        C1340Ki c1340Ki = this.n;
        if (c1340Ki != null) {
            c1340Ki.h(num);
        }
    }

    public static void a(WO3 wo3) {
        C1340Ki c1340Ki = wo3.n;
        if (c1340Ki != null) {
            c1340Ki.h(null);
        }
    }
}
