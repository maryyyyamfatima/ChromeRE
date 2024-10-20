package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z10 */
/* loaded from: classes.dex */
public abstract class AbstractC11971z10 {
    public static final C0070Ao a;
    public static final Handler b;

    static {
        UP0 up0 = new UP0();
        UP0 up02 = new UP0();
        up02.o(1);
        up02.a(0, false, false);
        up02.k(up02.i());
        byte[] array = up02.h().array();
        int length = array.length;
        up0.p(1, length, 1);
        ByteBuffer byteBuffer = up0.a;
        int i = up0.b - length;
        up0.b = i;
        byteBuffer.position(i);
        up0.a.put(array);
        int j = up0.j();
        up0.o(3);
        up0.c(2, 1);
        up0.e(1, j);
        up0.c(0, 158796327);
        int i2 = up0.i();
        up0.o(4);
        up0.e(3, 0);
        up0.e(2, 0);
        up0.e(1, 0);
        up0.e(0, i2);
        up0.k(up0.i());
        ByteBuffer h = up0.h();
        C5427fx0 c5427fx0 = new C5427fx0();
        C5427fx0.j(h, c5427fx0);
        a = new C0070Ao(c5427fx0, null);
        b = new Handler(Looper.getMainLooper());
    }

    public static void a(C0766Fx0 c0766Fx0, final C7849n00 c7849n00, final U80 u80, C11628y10 c11628y10, X82 x82, final AbstractC9896sy0 abstractC9896sy0, final boolean z, final boolean z2) {
        C0636Ex0 c0636Ex0;
        DV0 dv0 = new DV0() { // from class: v10
            @Override // defpackage.DV0
            public final Object apply(Object obj) {
                final Throwable th = (Throwable) obj;
                AbstractC9896sy0.this.c(u80, th);
                if (z2) {
                    Handler handler = AbstractC11971z10.b;
                    final C7849n00 c7849n002 = c7849n00;
                    handler.post(new Runnable() { // from class: x10
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toast.makeText(C7849n00.this.a.getApplicationContext(), "Elements Error (check settings):\n" + th.getMessage(), 1).show();
                        }
                    });
                } else if (z) {
                    Log.e("Elements DEBUG", "NOT A PRODUCTION CRASH BELOW. Review ElementsException message for details");
                    throw ZD0.a(th);
                }
                return AbstractC11971z10.a;
            }
        };
        x82.getClass();
        C10942w10 c10942w10 = new C10942w10();
        synchronized (c0766Fx0) {
            if (c0766Fx0.k.k()) {
                c0766Fx0.k = new C1025Hx();
            }
            c0766Fx0.k.d(c7849n00);
            c0766Fx0.h = u80;
            c0766Fx0.m = x82;
            C0636Ex0 c0636Ex02 = new C0636Ex0(c10942w10, c11628y10);
            c0766Fx0.l = c0636Ex02;
            C1025Hx c1025Hx = c0766Fx0.k;
            C0506Dx0 c0506Dx0 = new C0506Dx0(c0766Fx0);
            if (c1025Hx != null) {
                try {
                    C7532m43 c7532m43 = new C7532m43(c0636Ex02);
                    C10442ua2 c10442ua2 = new C10442ua2(c7532m43, c0506Dx0);
                    c7532m43.c(c10442ua2);
                    c1025Hx.a(new C10785va2(c10442ua2));
                    try {
                        x82.a(new S92(c10442ua2, dv0));
                    } catch (NullPointerException e) {
                        throw e;
                    } catch (Throwable th) {
                        AbstractC4148cE0.a(th);
                        MR2.b(th);
                        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                        nullPointerException.initCause(th);
                        throw nullPointerException;
                    }
                } catch (NullPointerException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    AbstractC4148cE0.a(th2);
                    MR2.b(th2);
                    NullPointerException nullPointerException2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                    nullPointerException2.initCause(th2);
                    throw nullPointerException2;
                }
            } else {
                throw new NullPointerException("other is null");
            }
        }
        synchronized (c0766Fx0) {
            if (!c0766Fx0.a() && (c0636Ex0 = c0766Fx0.l) != null) {
                synchronized (c0636Ex0.i) {
                    c0636Ex0.k = true;
                }
            }
        }
    }
}
