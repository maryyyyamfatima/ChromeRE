package defpackage;

import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.crash.ChromePureJavaExceptionReporter;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bQ */
/* loaded from: classes.dex */
public final class C3864bQ implements InterfaceC3657ao2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ PropertyModel g;
    public final /* synthetic */ C5582gQ h;

    @Override // defpackage.InterfaceC3657ao2
    public final void e() {
    }

    public C3864bQ(C5582gQ c5582gQ, String str, PropertyModel propertyModel) {
        this.h = c5582gQ;
        this.a = str;
        this.g = propertyModel;
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void c() {
        C12260zr3 b = C12260zr3.b();
        String str = this.a;
        if (b.c(str)) {
            final String format = String.format("The survey message prompt was dismissed on activity resumption because the survey with ID %s has expired.", str);
            AbstractC4851eH1.f("ChromeSurveyCtrler", format, new Object[0]);
            PostTask.c(QF3.h, new Runnable() { // from class: aQ
                @Override // java.lang.Runnable
                public final void run() {
                    ChromePureJavaExceptionReporter.d(new Throwable(format));
                }
            });
            ((C5265fV1) this.h.o).a(9, this.g);
        }
    }
}
