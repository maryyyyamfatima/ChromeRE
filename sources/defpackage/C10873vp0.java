package defpackage;

import J.N;
import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.chromium.chrome.browser.feed.FeedStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vp0 */
/* loaded from: classes.dex */
public final class C10873vp0 implements InterfaceC9395rX {
    public final C11918yr4 a;

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        Object a;
        C11216wp0 c11216wp0 = (C11216wp0) obj;
        InterfaceC3486aJ0 a2 = L44.a(abstractC9053qX);
        if (a2 != null) {
            C5671gg2 c5671gg2 = (C5671gg2) C6015hg2.l.j();
            C11559xp0 c11559xp0 = c11216wp0.k;
            if (c11559xp0 == null) {
                c11559xp0 = C11559xp0.m;
            }
            InterfaceC1377Kp1 interfaceC1377Kp1 = c11559xp0.k;
            if (c5671gg2.h) {
                c5671gg2.l();
                c5671gg2.h = false;
            }
            C6015hg2 c6015hg2 = (C6015hg2) c5671gg2.g;
            InterfaceC1377Kp1 interfaceC1377Kp12 = c6015hg2.j;
            if (!((AbstractC7504m0) interfaceC1377Kp12).a) {
                c6015hg2.j = QX0.r(interfaceC1377Kp12);
            }
            List list = c6015hg2.j;
            Charset charset = AbstractC1507Lp1.a;
            interfaceC1377Kp1.getClass();
            if (interfaceC1377Kp1 instanceof InterfaceC6812jz1) {
                List e = ((InterfaceC6812jz1) interfaceC1377Kp1).e();
                InterfaceC6812jz1 interfaceC6812jz1 = (InterfaceC6812jz1) list;
                int size = list.size();
                for (Object obj2 : e) {
                    if (obj2 == null) {
                        String a3 = AbstractC9307rF1.a("Element at index ", interfaceC6812jz1.size() - size, " is null.");
                        int size2 = interfaceC6812jz1.size();
                        while (true) {
                            size2--;
                            if (size2 < size) {
                                break;
                            }
                            interfaceC6812jz1.remove(size2);
                        }
                        throw new NullPointerException(a3);
                    }
                    if (obj2 instanceof AbstractC4147cE) {
                        interfaceC6812jz1.h((AbstractC4147cE) obj2);
                    } else {
                        interfaceC6812jz1.add((String) obj2);
                    }
                }
            } else if (!(interfaceC1377Kp1 instanceof InterfaceC2337Rz2)) {
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(interfaceC1377Kp1.size() + list.size());
                }
                int size3 = list.size();
                for (Object obj3 : interfaceC1377Kp1) {
                    if (obj3 == null) {
                        String a4 = AbstractC9307rF1.a("Element at index ", list.size() - size3, " is null.");
                        int size4 = list.size();
                        while (true) {
                            size4--;
                            if (size4 < size3) {
                                break;
                            }
                            list.remove(size4);
                        }
                        throw new NullPointerException(a4);
                    }
                    list.add(obj3);
                }
            } else {
                list.addAll(interfaceC1377Kp1);
            }
            byte[] byteArray = ((C6015hg2) c5671gg2.j()).toByteArray();
            FeedStream feedStream = ((C3835bK0) a2).a;
            int MPd9Dl$c = N.MPd9Dl$c(feedStream.d, feedStream, byteArray);
            C2924Wn c2924Wn = (C2924Wn) abstractC9053qX;
            c2924Wn.getClass();
            View view = c2924Wn.a;
            View view2 = c2924Wn.b;
            C1629Mo c1629Mo = c2924Wn.c;
            Object obj4 = c2924Wn.d;
            InterfaceC8177nx0 interfaceC8177nx0 = c2924Wn.f;
            String str = c2924Wn.g;
            C3998bo c3998bo = c2924Wn.h;
            K33 k33 = (K33) SenderStateOuterClass$SenderState.l.j();
            OX0 ox0 = C0206Bp0.n;
            C0076Ap0 c0076Ap0 = (C0076Ap0) C0206Bp0.l.j();
            if (c0076Ap0.h) {
                c0076Ap0.l();
                c0076Ap0.h = false;
            }
            C0206Bp0 c0206Bp0 = (C0206Bp0) c0076Ap0.g;
            c0206Bp0.j |= 1;
            c0206Bp0.k = MPd9Dl$c;
            k33.p(ox0, (C0206Bp0) c0076Ap0.j());
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = (SenderStateOuterClass$SenderState) k33.j();
            U80 u80 = c2924Wn.i;
            if (u80 == null) {
                throw new IllegalStateException("Missing required properties: conversionContext");
            }
            C2924Wn c2924Wn2 = new C2924Wn(view, view2, c1629Mo, obj4, senderStateOuterClass$SenderState, interfaceC8177nx0, str, c3998bo, u80);
            C11559xp0 c11559xp02 = c11216wp0.k;
            if (c11559xp02 == null) {
                c11559xp02 = C11559xp0.m;
            }
            OX0 ox02 = C1459Lf3.o;
            c11559xp02.getClass();
            ox02.getClass();
            c11559xp02.v(ox02);
            C5563gM0 c5563gM0 = c11559xp02.j;
            c5563gM0.getClass();
            NX0 nx0 = ox02.d;
            nx0.getClass();
            boolean z = c5563gM0.a.get(nx0) != null;
            C5971hZ c5971hZ = C5971hZ.a;
            C11918yr4 c11918yr4 = this.a;
            if (!z) {
                InterfaceC9738sX a5 = c11918yr4.a();
                DX dx = (DX) CommandOuterClass$Command.l.j();
                dx.p(C10429uY.m, C10429uY.k);
                ((C10081tX) a5).a((CommandOuterClass$Command) dx.j(), c2924Wn2, 2).c();
            } else {
                InterfaceC9738sX a6 = c11918yr4.a();
                C11559xp0 c11559xp03 = c11216wp0.k;
                if (c11559xp03 == null) {
                    c11559xp03 = C11559xp0.m;
                }
                c11559xp03.getClass();
                c11559xp03.v(ox02);
                Object c = c11559xp03.j.c(nx0);
                if (c == null) {
                    a = ox02.b;
                } else {
                    a = ox02.a(c);
                }
                CommandOuterClass$Command commandOuterClass$Command = ((C1459Lf3) a).k;
                if (commandOuterClass$Command == null) {
                    commandOuterClass$Command = CommandOuterClass$Command.l;
                }
                ((C10081tX) a6).a(commandOuterClass$Command, c2924Wn2, 2).c();
            }
            return c5971hZ;
        }
        return new C6315iZ(new IllegalArgumentException("feedActionsHandler not present in CommandEventData"));
    }

    public C10873vp0(C11918yr4 c11918yr4) {
        this.a = c11918yr4;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C11216wp0.o;
    }
}
