package com.google.android.libraries.elements.converters.intersectionobserver;

import com.google.android.libraries.elements.converters.intersectionobserver.DwellIntersectionObserver;
import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import defpackage.AbstractC10422uW2;
import defpackage.AbstractC9053qX;
import defpackage.C10081tX;
import defpackage.C10091tZ;
import defpackage.C10099ta2;
import defpackage.C2924Wn;
import defpackage.C3184Yn;
import defpackage.C4727dv0;
import defpackage.C5422fw1;
import defpackage.C9514rr1;
import defpackage.InterfaceC11303x40;
import defpackage.InterfaceC6416iq0;
import defpackage.InterfaceC7103kq0;
import defpackage.InterfaceC9738sX;
import defpackage.NW2;
import defpackage.QP0;
import defpackage.RP0;
import defpackage.TF0;
import defpackage.U80;
import defpackage.V82;
import defpackage.VY;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DwellIntersectionObserver extends IntersectionObserver {
    private final InterfaceC9738sX commandResolver;
    private final ArrayList criteriaList;
    private long delayInMs;
    private InterfaceC6416iq0 disposable;
    private IntersectionCriteria enterCriteria;
    private IntersectionCriteria exitCriteria;
    private boolean hasDwell;
    private boolean hasEntered;
    private QP0 onCancel;
    private QP0 onDwell;
    private QP0 onEnter;

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public String getGroupId() {
        return "";
    }

    public DwellIntersectionObserver(C4727dv0 c4727dv0, InterfaceC9738sX interfaceC9738sX, AbstractC9053qX abstractC9053qX, RP0 rp0) {
        super(abstractC9053qX);
        this.commandResolver = interfaceC9738sX;
        ArrayList arrayList = new ArrayList();
        this.criteriaList = arrayList;
        c4727dv0.getClass();
        C9514rr1 c9514rr1 = new C9514rr1();
        int b = c4727dv0.b(4);
        TF0 tf0 = null;
        if (b != 0) {
            c9514rr1.c(c4727dv0.a(b + c4727dv0.a), c4727dv0.b);
        } else {
            c9514rr1 = null;
        }
        if (c9514rr1 != null) {
            C9514rr1 c9514rr12 = new C9514rr1();
            int b2 = c4727dv0.b(4);
            if (b2 != 0) {
                c9514rr12.c(c4727dv0.a(b2 + c4727dv0.a), c4727dv0.b);
            } else {
                c9514rr12 = null;
            }
            IntersectionCriteria n = RP0.n(c9514rr12);
            this.enterCriteria = n;
            arrayList.add(n);
        }
        C9514rr1 c9514rr13 = new C9514rr1();
        int b3 = c4727dv0.b(6);
        if (b3 != 0) {
            c9514rr13.c(c4727dv0.a(b3 + c4727dv0.a), c4727dv0.b);
        } else {
            c9514rr13 = null;
        }
        if (c9514rr13 != null) {
            C9514rr1 c9514rr14 = new C9514rr1();
            int b4 = c4727dv0.b(6);
            if (b4 != 0) {
                c9514rr14.c(c4727dv0.a(b4 + c4727dv0.a), c4727dv0.b);
            } else {
                c9514rr14 = null;
            }
            IntersectionCriteria n2 = RP0.n(c9514rr14);
            this.exitCriteria = n2;
            arrayList.add(n2);
        }
        if (this.enterCriteria == null || this.exitCriteria == null) {
            arrayList.clear();
            return;
        }
        U80 u80 = ((C2924Wn) this.commandEventData).i;
        TF0 tf02 = new TF0();
        int b5 = c4727dv0.b(8);
        if (b5 != 0) {
            tf02.c(c4727dv0.a(b5 + c4727dv0.a), c4727dv0.b);
        } else {
            tf02 = null;
        }
        this.onEnter = rp0.o(tf02, u80);
        TF0 tf03 = new TF0();
        int b6 = c4727dv0.b(10);
        if (b6 != 0) {
            tf03.c(c4727dv0.a(b6 + c4727dv0.a), c4727dv0.b);
        } else {
            tf03 = null;
        }
        this.onCancel = rp0.o(tf03, u80);
        TF0 tf04 = new TF0();
        int b7 = c4727dv0.b(12);
        if (b7 != 0) {
            tf04.c(c4727dv0.a(b7 + c4727dv0.a), c4727dv0.b);
            tf0 = tf04;
        }
        this.onDwell = rp0.o(tf0, u80);
        this.delayInMs = Math.max(c4727dv0.b(14) != 0 ? c4727dv0.b.getInt(r6 + c4727dv0.a) & 4294967295L : 0L, 0L);
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public void criteriaMatched(ArrayList arrayList) {
        QP0 qp0;
        if (arrayList.isEmpty()) {
            return;
        }
        final AbstractC9053qX commandEventDataWithView = commandEventDataWithView();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IntersectionCriteria intersectionCriteria = (IntersectionCriteria) it.next();
            if (V82.a(intersectionCriteria, this.enterCriteria)) {
                if (this.hasEntered) {
                    continue;
                } else {
                    this.hasEntered = true;
                    QP0 qp02 = this.onEnter;
                    if (qp02 != null) {
                        VY a = ((C10081tX) this.commandResolver).a(qp02.a(), commandEventDataWithView, 2);
                        AbstractC10422uW2 abstractC10422uW2 = NW2.c;
                        a.getClass();
                        if (abstractC10422uW2 == null) {
                            throw new NullPointerException("scheduler is null");
                        }
                        new C10091tZ(a, abstractC10422uW2).c();
                    }
                    if (this.onDwell != null) {
                        long j = this.delayInMs;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        AbstractC10422uW2 abstractC10422uW22 = NW2.b;
                        if (timeUnit == null) {
                            throw new NullPointerException("unit is null");
                        }
                        if (abstractC10422uW22 == null) {
                            throw new NullPointerException("scheduler is null");
                        }
                        C10099ta2 c10099ta2 = new C10099ta2(Math.max(j, 0L), timeUnit, abstractC10422uW22);
                        C5422fw1 c5422fw1 = new C5422fw1(new InterfaceC11303x40() { // from class: cv0
                            @Override // defpackage.InterfaceC11303x40
                            public final void accept(Object obj) {
                                DwellIntersectionObserver.this.lambda$criteriaMatched$0(commandEventDataWithView, (Long) obj);
                            }
                        });
                        c10099ta2.a(c5422fw1);
                        this.disposable = c5422fw1;
                        registerDisposable(c5422fw1, conversionContext());
                    } else {
                        continue;
                    }
                }
            } else if (V82.a(intersectionCriteria, this.exitCriteria)) {
                InterfaceC6416iq0 interfaceC6416iq0 = this.disposable;
                if (interfaceC6416iq0 != null) {
                    interfaceC6416iq0.dispose();
                }
                if (this.hasEntered && !this.hasDwell && (qp0 = this.onCancel) != null) {
                    ((C10081tX) this.commandResolver).a(qp0.a(), commandEventDataWithView, 2).c();
                }
                this.hasEntered = false;
                this.hasDwell = false;
            }
        }
    }

    public void lambda$criteriaMatched$0(AbstractC9053qX abstractC9053qX, Long l) {
        QP0 qp0 = this.onDwell;
        if (qp0 != null) {
            ((C10081tX) this.commandResolver).a(qp0.a(), abstractC9053qX, 2).c();
            this.hasDwell = true;
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public ArrayList getCriteriaList() {
        return this.criteriaList;
    }

    private static void registerDisposable(InterfaceC6416iq0 interfaceC6416iq0, U80 u80) {
        InterfaceC7103kq0 interfaceC7103kq0 = ((C3184Yn) u80).f;
        if (interfaceC7103kq0 != null) {
            interfaceC7103kq0.a(interfaceC6416iq0);
        }
    }
}
