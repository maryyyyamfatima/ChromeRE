package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.elements.interfaces.CollectionDataSource;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cW */
/* loaded from: classes.dex */
public final class C4237cW extends DK2 {
    public final /* synthetic */ QP0 a;
    public final /* synthetic */ InterfaceC9738sX g;
    public final /* synthetic */ InterfaceC8710pX h;
    public final /* synthetic */ U80 i;
    public final /* synthetic */ AtomicReference j;
    public final /* synthetic */ CollectionDataSource k;
    public final /* synthetic */ C7849n00 l;
    public final /* synthetic */ AtomicInteger m;
    public final /* synthetic */ AtomicBoolean n;
    public final /* synthetic */ QP0 o;
    public final /* synthetic */ QP0 p;

    public C4237cW(QP0 qp0, InterfaceC9738sX interfaceC9738sX, InterfaceC8710pX interfaceC8710pX, U80 u80, AtomicReference atomicReference, CollectionDataSource collectionDataSource, C7849n00 c7849n00, AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, QP0 qp02, QP0 qp03) {
        this.a = qp0;
        this.g = interfaceC9738sX;
        this.h = interfaceC8710pX;
        this.i = u80;
        this.j = atomicReference;
        this.k = collectionDataSource;
        this.l = c7849n00;
        this.m = atomicInteger;
        this.n = atomicBoolean;
        this.o = qp02;
        this.p = qp03;
    }

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        CollectionDataSource collectionDataSource;
        int i3;
        QP0 qp0 = this.a;
        if (qp0 != null) {
            InterfaceC9738sX interfaceC9738sX = this.g;
            CommandOuterClass$Command a = qp0.a();
            InterfaceC8710pX interfaceC8710pX = this.h;
            C3184Yn c3184Yn = (C3184Yn) this.i;
            AbstractC4924eW.a(recyclerView, interfaceC9738sX, a, interfaceC8710pX, c3184Yn.v, c3184Yn.r);
        }
        AtomicReference atomicReference = this.j;
        if (atomicReference != null && atomicReference.get() != null) {
            ((C9746sY2) ((InterfaceC9061qY2) atomicReference.get())).a(recyclerView, i, i2);
        }
        AbstractC8305oK2 abstractC8305oK2 = recyclerView.r;
        if (abstractC8305oK2 == null || (collectionDataSource = this.k) == null || collectionDataSource.itemsCountUntilEnd() < 0) {
            return;
        }
        boolean a2 = AbstractC11769yR2.a(this.l.a);
        AbstractC12077zK2 abstractC12077zK2 = recyclerView.s;
        if (abstractC12077zK2 instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC12077zK2;
            if (a2 && linearLayoutManager.p == 0) {
                i3 = linearLayoutManager.R0();
            } else {
                i3 = linearLayoutManager.T0();
            }
        } else {
            i3 = -1;
        }
        if (i3 >= 0) {
            int q = abstractC8305oK2.q();
            if ((q - i3) - 1 <= collectionDataSource.itemsCountUntilEnd()) {
                AtomicInteger atomicInteger = this.m;
                if (q > atomicInteger.get()) {
                    atomicInteger.set(q);
                    collectionDataSource.loadMore();
                }
            }
        }
    }

    @Override // defpackage.DK2
    public final void r(int i, RecyclerView recyclerView) {
        QP0 qp0;
        QP0 qp02;
        U80 u80 = this.i;
        AtomicBoolean atomicBoolean = this.n;
        if (i == 0) {
            if (!atomicBoolean.compareAndSet(true, false) || (qp0 = this.o) == null) {
                return;
            }
            C3184Yn c3184Yn = (C3184Yn) u80;
            AbstractC4924eW.a(recyclerView, this.g, qp0.a(), this.h, c3184Yn.v, c3184Yn.r);
            return;
        }
        if (i == 1 && atomicBoolean.compareAndSet(false, true) && (qp02 = this.p) != null) {
            C3184Yn c3184Yn2 = (C3184Yn) u80;
            AbstractC4924eW.a(recyclerView, this.g, qp02.a(), this.h, c3184Yn2.v, c3184Yn2.r);
        }
    }
}
