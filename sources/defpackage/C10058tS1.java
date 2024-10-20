package defpackage;

import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10058tS1 {
    public static final C10058tS1 h = new C10058tS1();
    public Integer b;
    public boolean c;
    public boolean d;
    public int a = 0;
    public final C8687pS1 e = new C8687pS1();
    public final C9030qS1 f = new C9030qS1();
    public final RunnableC9372rS1 g = new Runnable() { // from class: rS1
        @Override // java.lang.Runnable
        public final void run() {
            Integer num;
            C10058tS1 c10058tS1 = C10058tS1.this;
            c10058tS1.c = false;
            Integer num2 = c10058tS1.b;
            if (num2 != null && c10058tS1.a != num2.intValue()) {
                int intValue = c10058tS1.b.intValue();
                c10058tS1.b = null;
                c10058tS1.b(intValue);
            } else if (c10058tS1.d && c10058tS1.a == 2 && (num = (Integer) c10058tS1.e.get()) != null) {
                c10058tS1.b(num.intValue());
            }
        }
    };

    public final void a(int i) {
        Object obj = ThreadUtils.a;
        if (this.c) {
            this.b = Integer.valueOf(i);
        } else {
            b(i);
        }
    }

    public final void b(int i) {
        ThreadUtils.b().postDelayed(this.g, 60000);
        this.c = true;
        this.a = i;
        this.f.a(i);
    }
}
