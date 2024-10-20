package defpackage;

import android.app.Activity;
import android.os.Handler;
import androidx.appcompat.app.a;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ab2 */
/* loaded from: classes.dex */
public final class C3579ab2 implements InterfaceC6389il3 {
    public final Activity a;
    public final C9707sQ3 g;
    public final InterfaceC0950Hi h;
    public final Q44 i;
    public final C6732jl3 j;

    @Override // defpackage.InterfaceC6389il3
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.InterfaceC6389il3
    public final /* synthetic */ void d(int i) {
    }

    public C3579ab2(a aVar, C9707sQ3 c9707sQ3, C1340Ki c1340Ki, C6732jl3 c6732jl3) {
        Handler handler = new Handler();
        this.a = aVar;
        this.g = c9707sQ3;
        this.h = c1340Ki;
        this.i = new Q44(aVar, handler);
        this.j = c6732jl3;
        c6732jl3.a.h.add(this);
    }

    @Override // defpackage.InterfaceC6389il3
    public final void a() {
        C1173Ja2.a().getClass();
        if (O83.a.e("Chrome.OfflineIndicatorV2.HasPersistentOfflineContent", false)) {
            C9707sQ3 c9707sQ3 = this.g;
            if (c9707sQ3.e().isShown()) {
                C12180ze1 c12180ze1 = new C12180ze1(this.a.getResources(), "IPH_DownloadIndicator", R.string.0_resource_name_obfuscated_res_0x7f140545, R.string.0_resource_name_obfuscated_res_0x7f140543);
                c12180ze1.h = c9707sQ3.e();
                c12180ze1.i = new Runnable() { // from class: Ya2
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0950Hi interfaceC0950Hi = C3579ab2.this.h;
                        if (interfaceC0950Hi == null) {
                            return;
                        }
                        ((C1340Ki) interfaceC0950Hi).h(Integer.valueOf(R.id.downloads_menu_id));
                    }
                };
                c12180ze1.k = new Runnable() { // from class: Za2
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0950Hi interfaceC0950Hi = C3579ab2.this.h;
                        if (interfaceC0950Hi == null) {
                            return;
                        }
                        ((C1340Ki) interfaceC0950Hi).h(null);
                    }
                };
                this.i.a(c12180ze1.a());
            }
        }
    }
}
