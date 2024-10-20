package defpackage;

import java.util.List;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.AppHooks;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PB2 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        final C0524Ea3 a = AbstractC0654Fa3.a();
        a.getClass();
        TraceEvent i = TraceEvent.i("SigninHelper.onMainActivityStart", null);
        try {
            a.h.a().g(new Callback() { // from class: ta3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    final List list = (List) obj;
                    final C0524Ea3 c0524Ea3 = C0524Ea3.this;
                    c0524Ea3.getClass();
                    c0524Ea3.g.b(new Runnable() { // from class: ua3
                        @Override // java.lang.Runnable
                        public final void run() {
                            final C0524Ea3 c0524Ea32 = C0524Ea3.this;
                            c0524Ea32.getClass();
                            final List list2 = list;
                            c0524Ea32.a.u(new Runnable() { // from class: za3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C0524Ea3 c0524Ea33 = C0524Ea3.this;
                                    List list3 = list2;
                                    c0524Ea33.b(list3, false);
                                    B4.b(c0524Ea33.h, list3, new C11129wa3(c0524Ea33));
                                }
                            });
                        }
                    });
                }
            });
            if (i != null) {
                i.close();
            }
            if (C5929hQ2.a == null) {
                C5929hQ2.a = AppHooks.get().p();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
