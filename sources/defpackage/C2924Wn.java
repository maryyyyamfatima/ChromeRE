package defpackage;

import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2924Wn extends AbstractC9053qX {
    public final View a;
    public final View b;
    public final C1629Mo c;
    public final Object d;
    public final SenderStateOuterClass$SenderState e;
    public final InterfaceC8177nx0 f;
    public final String g;
    public final C3998bo h;
    public final U80 i;

    public C2924Wn(View view, View view2, C1629Mo c1629Mo, Object obj, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, InterfaceC8177nx0 interfaceC8177nx0, String str, C3998bo c3998bo, U80 u80) {
        this.a = view;
        this.b = view2;
        this.c = c1629Mo;
        this.d = obj;
        this.e = senderStateOuterClass$SenderState;
        this.f = interfaceC8177nx0;
        this.g = str;
        this.h = c3998bo;
        this.i = u80;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.i);
        StringBuilder a = AbstractC10975w63.a("CommandEventData{view=", valueOf, ", anchorView=", valueOf2, ", touchLocation=");
        AbstractC9972tB0.a(a, valueOf3, ", customData=", valueOf4, ", senderState=");
        AbstractC9972tB0.a(a, valueOf5, ", elementBuilder=", valueOf6, ", identifier=");
        AbstractC9972tB0.a(a, this.g, ", elementsConfig=", valueOf7, ", conversionContext=");
        return Y5.a(a, valueOf8, "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9053qX)) {
            return false;
        }
        AbstractC9053qX abstractC9053qX = (AbstractC9053qX) obj;
        View view = this.a;
        if (view != null ? view.equals(((C2924Wn) abstractC9053qX).a) : ((C2924Wn) abstractC9053qX).a == null) {
            View view2 = this.b;
            if (view2 != null ? view2.equals(((C2924Wn) abstractC9053qX).b) : ((C2924Wn) abstractC9053qX).b == null) {
                C1629Mo c1629Mo = this.c;
                if (c1629Mo != null ? c1629Mo.equals(((C2924Wn) abstractC9053qX).c) : ((C2924Wn) abstractC9053qX).c == null) {
                    Object obj2 = this.d;
                    if (obj2 != null ? obj2.equals(((C2924Wn) abstractC9053qX).d) : ((C2924Wn) abstractC9053qX).d == null) {
                        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = this.e;
                        if (senderStateOuterClass$SenderState != null ? senderStateOuterClass$SenderState.equals(((C2924Wn) abstractC9053qX).e) : ((C2924Wn) abstractC9053qX).e == null) {
                            InterfaceC8177nx0 interfaceC8177nx0 = this.f;
                            if (interfaceC8177nx0 != null ? interfaceC8177nx0.equals(((C2924Wn) abstractC9053qX).f) : ((C2924Wn) abstractC9053qX).f == null) {
                                String str = this.g;
                                if (str != null ? str.equals(((C2924Wn) abstractC9053qX).g) : ((C2924Wn) abstractC9053qX).g == null) {
                                    C3998bo c3998bo = this.h;
                                    if (c3998bo != null ? c3998bo.equals(((C2924Wn) abstractC9053qX).h) : ((C2924Wn) abstractC9053qX).h == null) {
                                        if (this.i.equals(((C2924Wn) abstractC9053qX).i)) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        View view = this.a;
        int hashCode = ((view == null ? 0 : view.hashCode()) ^ 1000003) * 1000003;
        View view2 = this.b;
        int hashCode2 = (hashCode ^ (view2 == null ? 0 : view2.hashCode())) * 1000003;
        C1629Mo c1629Mo = this.c;
        int hashCode3 = (hashCode2 ^ (c1629Mo == null ? 0 : c1629Mo.hashCode())) * 1000003;
        Object obj = this.d;
        int hashCode4 = (hashCode3 ^ (obj == null ? 0 : obj.hashCode())) * 1000003;
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = this.e;
        if (senderStateOuterClass$SenderState == null) {
            i = 0;
        } else {
            i = senderStateOuterClass$SenderState.a;
            if (i == 0) {
                C7931nE2 c7931nE2 = C7931nE2.c;
                c7931nE2.getClass();
                i = c7931nE2.b(SenderStateOuterClass$SenderState.class).j(senderStateOuterClass$SenderState);
                senderStateOuterClass$SenderState.a = i;
            }
        }
        int i2 = (hashCode4 ^ i) * 1000003;
        InterfaceC8177nx0 interfaceC8177nx0 = this.f;
        int hashCode5 = (i2 ^ (interfaceC8177nx0 == null ? 0 : interfaceC8177nx0.hashCode())) * 1000003;
        String str = this.g;
        int hashCode6 = (hashCode5 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        C3998bo c3998bo = this.h;
        return (((c3998bo != null ? c3998bo.hashCode() : 0) ^ hashCode6) * 1000003) ^ this.i.hashCode();
    }
}
