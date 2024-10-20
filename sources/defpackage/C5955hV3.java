package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import com.youtube.android.libraries.elements.templates.EkoProcessor;
import io.grpc.Status;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hV3 */
/* loaded from: classes.dex */
public final class C5955hV3 implements InterfaceC9395rX {
    public final InterfaceC9790sg0 a;
    public final boolean b = Boolean.FALSE.booleanValue();

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, final AbstractC9053qX abstractC9053qX) {
        final C6299iV3 c6299iV3 = (C6299iV3) obj;
        return new C0664Fc3(this.a.a(c6299iV3.l).g(C5785h.a), new DV0() { // from class: gV3
            @Override // defpackage.DV0
            public final Object apply(Object obj2) {
                byte[] bArr;
                SenderStateOuterClass$SenderState senderStateOuterClass$SenderState;
                C6299iV3 c6299iV32 = c6299iV3;
                C5955hV3 c5955hV3 = C5955hV3.this;
                c5955hV3.getClass();
                byte[] bArr2 = (byte[]) ((AbstractC9095qe2) obj2).d(AbstractC8868py0.a);
                try {
                    C6985kV3 c6985kV3 = (C6985kV3) C7329lV3.o.j();
                    ZD d = AbstractC4147cE.d(bArr2);
                    if (c6985kV3.h) {
                        c6985kV3.l();
                        c6985kV3.h = false;
                    }
                    C7329lV3 c7329lV3 = (C7329lV3) c6985kV3.g;
                    c7329lV3.getClass();
                    c7329lV3.j |= 1;
                    c7329lV3.k = d;
                    AbstractC9053qX abstractC9053qX2 = abstractC9053qX;
                    if (abstractC9053qX2 != null && (senderStateOuterClass$SenderState = ((C2924Wn) abstractC9053qX2).e) != null) {
                        if (c6985kV3.h) {
                            c6985kV3.l();
                            c6985kV3.h = false;
                        }
                        C7329lV3 c7329lV32 = (C7329lV3) c6985kV3.g;
                        c7329lV32.getClass();
                        c7329lV32.l = senderStateOuterClass$SenderState;
                        c7329lV32.j |= 2;
                    }
                    C6641jV3 c6641jV3 = c6299iV32.m;
                    if (c6641jV3 == null) {
                        c6641jV3 = C6641jV3.l;
                    }
                    if (c6985kV3.h) {
                        c6985kV3.l();
                        c6985kV3.h = false;
                    }
                    C7329lV3 c7329lV33 = (C7329lV3) c6985kV3.g;
                    c7329lV33.getClass();
                    c6641jV3.getClass();
                    c7329lV33.m = c6641jV3;
                    c7329lV33.j |= 4;
                    byte[] byteArray = c6299iV32.toByteArray();
                    AV f = DV.f(byteArray, 0, byteArray.length, false);
                    while (true) {
                        if (!f.e()) {
                            int B = f.B();
                            if ((B >>> 3) == 2) {
                                bArr = f.l();
                                break;
                            }
                            f.E(B);
                        } else {
                            bArr = AbstractC8868py0.a;
                            break;
                        }
                    }
                    C3709ax0 a = EkoProcessor.a(bArr, ((C7329lV3) c6985kV3.j()).toByteArray(), c5955hV3.b);
                    Status status = a.a;
                    if (status.b()) {
                        c5955hV3.a.b(c6299iV32.l, a.b);
                        return C5971hZ.a;
                    }
                    throw new C10239ty0("Eko processor error: " + status.getDescription());
                } catch (IOException e) {
                    throw new C10239ty0("Invalid eko template", e);
                }
            }
        });
    }

    public C5955hV3(InterfaceC9790sg0 interfaceC9790sg0) {
        this.a = interfaceC9790sg0;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C6299iV3.q;
    }
}
