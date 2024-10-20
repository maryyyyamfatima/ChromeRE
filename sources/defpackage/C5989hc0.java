package defpackage;

import J.N;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5989hc0 extends BA0 {
    public final /* synthetic */ C6333ic0 a;

    public C5989hc0(C6333ic0 c6333ic0) {
        this.a = c6333ic0;
    }

    @Override // defpackage.BA0
    public final void J0(Tab tab, final GURL gurl) {
        if (tab.n()) {
            return;
        }
        this.a.c.b(gurl, new Callback() { // from class: gc0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [dc0] */
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C5989hc0 c5989hc0 = C5989hc0.this;
                c5989hc0.getClass();
                if (((Boolean) obj).booleanValue()) {
                    final C6333ic0 c6333ic0 = c5989hc0.a;
                    c6333ic0.getClass();
                    final ?? r0 = new Callback() { // from class: dc0
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj2) {
                            return new ZE(this, obj2);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj2) {
                            C3255Zb0 c3255Zb0 = (C3255Zb0) obj2;
                            final C6333ic0 c6333ic02 = C6333ic0.this;
                            c6333ic02.getClass();
                            if (c3255Zb0.b < c6333ic02.g || c3255Zb0.a < c6333ic02.h) {
                                return;
                            }
                            C12180ze1 c12180ze1 = new C12180ze1(c6333ic02.a.getResources(), "IPH_Crow", R.string.f71860_resource_name_obfuscated_res_0x7f1403dc, R.string.f71860_resource_name_obfuscated_res_0x7f1403dc);
                            c12180ze1.h = c6333ic02.f;
                            c12180ze1.i = new Runnable() { // from class: ec0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    InterfaceC0950Hi interfaceC0950Hi = C6333ic0.this.b;
                                    if (interfaceC0950Hi != null) {
                                        ((C1340Ki) interfaceC0950Hi).h(Integer.valueOf(R.id.crow_chip_view));
                                    }
                                }
                            };
                            c12180ze1.k = new Runnable() { // from class: fc0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((C1340Ki) C6333ic0.this.b).h(null);
                                }
                            };
                            c6333ic02.e.a(c12180ze1.a());
                        }
                    };
                    Callback callback = new Callback() { // from class: Yb0
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj2) {
                            return new ZE(this, obj2);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj2) {
                            int[] iArr = (int[]) obj2;
                            r0.onResult(new C3255Zb0(iArr[0], iArr[1]));
                        }
                    };
                    N.M97H6TCG(gurl, c6333ic0.i, callback);
                }
            }
        });
    }
}
