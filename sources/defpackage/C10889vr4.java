package defpackage;

import com.google.common.util.concurrent.v;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vr4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10889vr4 extends AbstractC4734dw1 implements InterfaceC6982kV0 {
    public final /* synthetic */ FY0 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ AbstractC9053qX i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10889vr4(FY0 fy0, Object obj, AbstractC9053qX abstractC9053qX, C4370cs4 c4370cs4) {
        super(0);
        this.g = fy0;
        this.h = obj;
        this.i = abstractC9053qX;
    }

    @Override // defpackage.InterfaceC6982kV0
    public final Object d() {
        this.g.getClass();
        if (!((((EY0) this.h).j & 1) != 0)) {
            return new v(new IllegalArgumentException("GetClickTrackingIdentifierCommand does not have a DataStore output path"));
        }
        AbstractC9053qX abstractC9053qX = this.i;
        return abstractC9053qX == null ? new v(new IllegalStateException("No CommandEventData was provided")) : ((C2924Wn) abstractC9053qX).i.b() == null ? new v(new IllegalStateException("No LoggingNode is associated with the Element")) : new v(new IllegalStateException("VeElementsInteractionLogger is needed on the client to impress and extract VEs"));
    }
}
