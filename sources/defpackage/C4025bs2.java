package defpackage;

import java.nio.ByteBuffer;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bs2 */
/* loaded from: classes.dex */
public final class C4025bs2 implements InterfaceC7876n43 {
    public final /* synthetic */ InterfaceC7876n43 a;
    public final /* synthetic */ AbstractC4368cs2 b;

    public C4025bs2(AbstractC4368cs2 abstractC4368cs2, InterfaceC7876n43 interfaceC7876n43) {
        this.b = abstractC4368cs2;
        this.a = interfaceC7876n43;
    }

    @Override // defpackage.InterfaceC7876n43
    public final ByteBuffer get() {
        ByteBuffer byteBuffer = null;
        InterfaceC7876n43 interfaceC7876n43 = this.a;
        if (interfaceC7876n43 != null) {
            try {
                TraceEvent i = TraceEvent.i("PersistedTabData.Serialize", null);
                try {
                    ByteBuffer byteBuffer2 = interfaceC7876n43.get();
                    if (i != null) {
                        i.close();
                    }
                    byteBuffer = byteBuffer2;
                } catch (Throwable th) {
                    if (i != null) {
                        try {
                            i.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            } catch (OutOfMemoryError e) {
                AbstractC4851eH1.a("PTD", "Out of memory error when attempting to save PersistedTabData. Details: " + e.getMessage(), new Object[0]);
            }
            EI2.b("Tabs.PersistedTabData.Serialize." + this.b.i(), byteBuffer != null);
        }
        return byteBuffer;
    }

    @Override // defpackage.InterfaceC7876n43
    public final void a() {
        this.a.a();
    }
}
