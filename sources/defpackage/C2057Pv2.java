package defpackage;

import android.content.Context;
import com.google.android.gms.feedback.FeedbackOptions;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pv2 */
/* loaded from: classes.dex */
public final class C2057Pv2 implements InterfaceC11737yL0 {
    public final Context a;
    public AbstractRunnableC9679sL0 b;

    public C2057Pv2(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.InterfaceC11737yL0
    public final void a(AbstractRunnableC9679sL0 abstractRunnableC9679sL0) {
        Object obj = ThreadUtils.a;
        this.b = abstractRunnableC9679sL0;
        FeedbackOptions a = AL0.a(abstractRunnableC9679sL0).a();
        C3588ad c3588ad = AbstractC7964nL0.a;
        C8308oL0 c8308oL0 = new C8308oL0(this.a);
        long nanoTime = System.nanoTime();
        C6144i21 c6144i21 = c8308oL0.h;
        C7276lL0 c7276lL0 = new C7276lL0(c6144i21, a, c6144i21.b.a, nanoTime);
        c6144i21.b.c(0, c7276lL0);
        AF3 b = AbstractC7799mr2.b(c7276lL0);
        InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: Nv2
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj2) {
                C2057Pv2.this.b = null;
            }
        };
        b.getClass();
        b.f(AbstractC10681vF3.a, interfaceC7371ld2);
        b.c(new InterfaceC2872Wc2() { // from class: Ov2
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(Exception exc) {
                C2057Pv2 c2057Pv2 = C2057Pv2.this;
                c2057Pv2.getClass();
                AbstractC4851eH1.f("Feedback", "Feedback through Google API failed. Falling back to legacy mode.", new Object[0]);
                new C8188nz1(c2057Pv2.a).a(c2057Pv2.b);
                c2057Pv2.b = null;
            }
        });
    }
}
