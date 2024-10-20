package defpackage;

import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h04, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5791h04 {
    public static final QF3 b;
    public static final QF3 c;
    public static final QF3 d;
    public static final QF3 e;
    public static final QF3 f;
    public int a = 0;

    static {
        C5447g04 c5447g04 = new C5447g04();
        QF3 qf3 = QF3.i;
        QF3 b2 = qf3.b(c5447g04, new C5791h04());
        b = b2;
        C5791h04 c5791h04 = new C5791h04();
        c5791h04.a = 1;
        c = qf3.b(c5447g04, c5791h04);
        d = b2.a(0);
        e = b2.a(1);
        f = b2.a(2);
        if (C4142cD.b) {
            return;
        }
        C4142cD.b = true;
        PostTask.e.set(1, new C4142cD());
    }
}
