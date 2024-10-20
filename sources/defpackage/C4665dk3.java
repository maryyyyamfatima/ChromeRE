package defpackage;

import J.N;
import android.content.Context;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.paint_preview.services.PaintPreviewTabService;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dk3 */
/* loaded from: classes.dex */
public final class C4665dk3 implements InterfaceC0259Bz3 {
    public final /* synthetic */ InterfaceC10590uz3 a;
    public final /* synthetic */ WindowAndroid g;

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void c(TabModel tabModel, TabModel tabModel2) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void g(Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void l(int i, Tab tab) {
    }

    public C4665dk3(AbstractC11276wz3 abstractC11276wz3, C10285u6 c10285u6) {
        this.a = abstractC11276wz3;
        this.g = c10285u6;
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void a() {
        boolean z;
        boolean z2;
        final PaintPreviewTabService paintPreviewTabService;
        InterfaceC10590uz3 interfaceC10590uz3 = this.a;
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
        Tab h = abstractC11276wz3.h();
        if (h == null || h.n() || h.isNativePage()) {
            z = true;
        } else {
            String h2 = h.getUrl().h();
            z = !(h2.equals("http") || h2.equals("https"));
        }
        if (z) {
            C5352fk3.f = false;
        }
        Context context = (Context) this.g.j.get();
        if (context != null) {
            C7851n02.i.getClass();
            if (C7851n02.a(context)) {
                z2 = false;
                paintPreviewTabService = (PaintPreviewTabService) N.M$ZOxizP();
                paintPreviewTabService.getClass();
                new C7401li2(paintPreviewTabService, interfaceC10590uz3);
                if (z2 && paintPreviewTabService.a == null) {
                    int i = abstractC11276wz3.i();
                    paintPreviewTabService.a = new RunnableC6370ii2(paintPreviewTabService, (i != -1 || abstractC11276wz3.o()) ? new int[0] : new int[]{i});
                    PostTask.b(AbstractC5103f04.a, new Runnable() { // from class: ji2
                        @Override // java.lang.Runnable
                        public final void run() {
                            PaintPreviewTabService paintPreviewTabService2 = PaintPreviewTabService.this;
                            paintPreviewTabService2.a.run();
                            paintPreviewTabService2.a = null;
                        }
                    }, 120000L);
                }
                abstractC11276wz3.s(this);
            }
        }
        z2 = true;
        paintPreviewTabService = (PaintPreviewTabService) N.M$ZOxizP();
        paintPreviewTabService.getClass();
        new C7401li2(paintPreviewTabService, interfaceC10590uz3);
        if (z2) {
            int i2 = abstractC11276wz3.i();
            paintPreviewTabService.a = new RunnableC6370ii2(paintPreviewTabService, (i2 != -1 || abstractC11276wz3.o()) ? new int[0] : new int[]{i2});
            PostTask.b(AbstractC5103f04.a, new Runnable() { // from class: ji2
                @Override // java.lang.Runnable
                public final void run() {
                    PaintPreviewTabService paintPreviewTabService2 = PaintPreviewTabService.this;
                    paintPreviewTabService2.a.run();
                    paintPreviewTabService2.a = null;
                }
            }, 120000L);
        }
        abstractC11276wz3.s(this);
    }
}
