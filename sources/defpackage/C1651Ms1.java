package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.google.android.libraries.elements.converters.g;
import com.google.android.libraries.elements.interfaces.CollectionDataSource;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ms1 */
/* loaded from: classes.dex */
public final class C1651Ms1 extends AbstractC1392Ks1 {
    public final U80 e;
    public final CollectionDataSource f;
    public final InterfaceC9738sX g;
    public final ArrayList h;
    public int i;

    @Override // defpackage.AbstractC1002Hs1
    public final void j(d dVar) {
    }

    @Override // defpackage.AbstractC1002Hs1
    public final void b(RecyclerView recyclerView, d dVar) {
        super.b(recyclerView, dVar);
        int f = dVar.f();
        int i = this.i;
        if (i != -1 && i != f) {
            CollectionDataSource collectionDataSource = this.f;
            collectionDataSource.moveItem(i, f);
            CommandOuterClass$Command onItemDroppedCommand = collectionDataSource.getOnItemDroppedCommand();
            int i2 = this.i;
            if (onItemDroppedCommand != null) {
                C2794Vn a = AbstractC9053qX.a();
                K33 k33 = (K33) SenderStateOuterClass$SenderState.l.j();
                OX0 ox0 = C9868st0.p;
                C9525rt0 c9525rt0 = (C9525rt0) C9868st0.n.j();
                if (c9525rt0.h) {
                    c9525rt0.l();
                    c9525rt0.h = false;
                }
                C9868st0 c9868st0 = (C9868st0) c9525rt0.g;
                c9868st0.j |= 2;
                c9868st0.l = i2;
                if (c9525rt0.h) {
                    c9525rt0.l();
                    c9525rt0.h = false;
                }
                C9868st0 c9868st02 = (C9868st0) c9525rt0.g;
                c9868st02.j |= 4;
                c9868st02.m = f;
                k33.p(ox0, (C9868st0) c9525rt0.j());
                a.e = (SenderStateOuterClass$SenderState) k33.j();
                C5847hA0 c = ((C10081tX) this.g).a(onItemDroppedCommand, a.a(), 2).c();
                InterfaceC7103kq0 interfaceC7103kq0 = ((C3184Yn) this.e).f;
                if (interfaceC7103kq0 != null) {
                    interfaceC7103kq0.a(c);
                }
            }
        }
        this.i = -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1651Ms1(defpackage.U80 r3, com.google.android.libraries.elements.interfaces.CollectionDataSource r4, defpackage.C5612gW r5, defpackage.InterfaceC9738sX r6) {
        /*
            r2 = this;
            TF0 r0 = r5.h()
            if (r0 == 0) goto L16
            TF0 r0 = r5.h()
            int r0 = r0.j()
            r1 = 405782140(0x182fbe7c, float:2.271439E-24)
            if (r0 != r1) goto L16
            r5 = 15
            goto L21
        L16:
            int r5 = r5.i()
            r0 = 1
            if (r5 != r0) goto L20
            r5 = 12
            goto L21
        L20:
            r5 = 3
        L21:
            r2.<init>(r5)
            r5 = -1
            r2.i = r5
            r2.e = r3
            r2.f = r4
            r2.g = r6
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1651Ms1.<init>(U80, com.google.android.libraries.elements.interfaces.CollectionDataSource, gW, sX):void");
    }

    @Override // defpackage.AbstractC1002Hs1
    public final boolean h(RecyclerView recyclerView, d dVar, d dVar2) {
        AbstractC8305oK2 abstractC8305oK2 = recyclerView.r;
        if (!(abstractC8305oK2 instanceof HJ2)) {
            return false;
        }
        int f = dVar.f();
        int f2 = dVar2.f();
        if (this.i == -1) {
            this.i = f;
        }
        ((HJ2) abstractC8305oK2).i.f0(f, f2);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C2885Wf0 c2885Wf0 = (C2885Wf0) it.next();
            c2885Wf0.getClass();
            int i = g.z;
            C3390a13 c3390a13 = c2885Wf0.a;
            if (c3390a13.q() != null) {
                c3390a13.o(new C6383ik3(1, Integer.valueOf(f), Integer.valueOf(f2)), "updateState:DataDrivenCollectionSection.onItemDraggedStateUpdate");
            }
        }
        return true;
    }
}
