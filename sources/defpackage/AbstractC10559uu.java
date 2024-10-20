package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uu */
/* loaded from: classes.dex */
public abstract class AbstractC10559uu {
    public final C4856eI1 a;
    public final String b;
    public BM2 c;
    public final List d;

    public AbstractC10559uu(String str) {
        WH.e(str);
        this.b = str;
        C4856eI1 c4856eI1 = new C4856eI1("MediaControlChannel");
        this.a = c4856eI1;
        if (!TextUtils.isEmpty(null)) {
            c4856eI1.c = TextUtils.isEmpty(null) ? null : String.format("[%s] ", null);
        }
        this.d = Collections.synchronizedList(new ArrayList());
    }

    public final void c(final long j, String str) {
        C4856eI1 c4856eI1 = this.a;
        c4856eI1.getClass();
        final BM2 bm2 = this.c;
        if (bm2 == null) {
            c4856eI1.d("Attempt to send text message without a sink", new Object[0]);
            return;
        }
        InterfaceC6911kH interfaceC6911kH = bm2.a;
        if (interfaceC6911kH == null) {
            throw new IllegalStateException("Device is not connected");
        }
        ((C8136nq1) interfaceC6911kH).n(this.b, str).c(new InterfaceC2872Wc2() { // from class: AM2
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(Exception exc) {
                BM2 bm22 = BM2.this;
                bm22.getClass();
                int i = exc instanceof C10114td ? ((C10114td) exc).a.g : 13;
                Iterator it = bm22.c.c.d.iterator();
                while (it.hasNext()) {
                    ((C9353rO2) it.next()).b(j, i, null);
                }
            }
        });
    }

    public final void b(C9353rO2 c9353rO2) {
        this.d.add(c9353rO2);
    }

    public final long a() {
        BM2 bm2 = this.c;
        if (bm2 == null) {
            this.a.d("Attempt to generate requestId without a sink", new Object[0]);
            return 0L;
        }
        return bm2.b.getAndIncrement();
    }
}
