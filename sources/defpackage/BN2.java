package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.v;
import com.google.protobuf.MessageLite;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BN2 extends AbstractC7720me1 {
    public final MessageLite a;

    public BN2(E4 e4) {
        this.a = e4;
    }

    @Override // defpackage.AbstractC7720me1
    public final RD1 a(final IOException iOException, C2873Wc3 c2873Wc3) {
        if (iOException.getCause() instanceof C1127Ir1) {
            C9803si1 c = AbstractC5957hW0.c(this.a);
            final C3003Xc3 c3003Xc3 = c2873Wc3.a;
            c3003Xc3.getClass();
            return AbstractC5957hW0.a(AbstractC5957hW0.e(c, AbstractC4575dU3.b(new InterfaceC3299Zk() { // from class: Qc3
                @Override // defpackage.InterfaceC3299Zk
                public final RD1 apply(Object obj) {
                    C3003Xc3 c3003Xc32 = C3003Xc3.this;
                    c3003Xc32.c((Uri) AbstractC5957hW0.b(c3003Xc32.b), obj);
                    return C9803si1.g;
                }
            }), c3003Xc3.d), IOException.class, new InterfaceC3299Zk() { // from class: AN2
                @Override // defpackage.InterfaceC3299Zk
                public final RD1 apply(Object obj) {
                    IOException iOException2 = iOException;
                    iOException2.getClass();
                    throw iOException2;
                }
            }, EnumC6747jo0.a);
        }
        return new v(iOException);
    }
}
