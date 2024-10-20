package com.google.android.libraries.elements.converters.intersectionobserver;

import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import defpackage.AbstractC10422uW2;
import defpackage.AbstractC9053qX;
import defpackage.C10081tX;
import defpackage.C10091tZ;
import defpackage.C2924Wn;
import defpackage.C9514rr1;
import defpackage.EC2;
import defpackage.InterfaceC9738sX;
import defpackage.NW2;
import defpackage.QP0;
import defpackage.RP0;
import defpackage.TF0;
import defpackage.V82;
import defpackage.VY;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ProminenceIntersectionObserver extends IntersectionObserver {
    private final InterfaceC9738sX commandResolver;
    private final ArrayList criteriaList;
    private IntersectionCriteria enterCriteria;
    private IntersectionCriteria exitCriteria;
    private final String groupKey;
    private boolean hasEntered;
    private QP0 onEnter;
    private QP0 onExit;

    public ProminenceIntersectionObserver(EC2 ec2, InterfaceC9738sX interfaceC9738sX, AbstractC9053qX abstractC9053qX, RP0 rp0) {
        super(abstractC9053qX);
        this.commandResolver = interfaceC9738sX;
        ArrayList arrayList = new ArrayList();
        this.criteriaList = arrayList;
        ec2.getClass();
        C9514rr1 c9514rr1 = new C9514rr1();
        int b = ec2.b(4);
        if (b != 0) {
            c9514rr1.c(ec2.a(b + ec2.a), ec2.b);
        } else {
            c9514rr1 = null;
        }
        if (c9514rr1 != null) {
            TF0 tf0 = new TF0();
            int b2 = ec2.b(8);
            if (b2 != 0) {
                tf0.c(ec2.a(b2 + ec2.a), ec2.b);
            } else {
                tf0 = null;
            }
            if (tf0 != null) {
                C9514rr1 c9514rr12 = new C9514rr1();
                int b3 = ec2.b(4);
                if (b3 != 0) {
                    c9514rr12.c(ec2.a(b3 + ec2.a), ec2.b);
                } else {
                    c9514rr12 = null;
                }
                IntersectionCriteria n = RP0.n(c9514rr12);
                this.enterCriteria = n;
                arrayList.add(n);
                TF0 tf02 = new TF0();
                int b4 = ec2.b(8);
                if (b4 != 0) {
                    tf02.c(ec2.a(b4 + ec2.a), ec2.b);
                } else {
                    tf02 = null;
                }
                this.onEnter = rp0.o(tf02, ((C2924Wn) this.commandEventData).i);
            }
        }
        C9514rr1 c9514rr13 = new C9514rr1();
        int b5 = ec2.b(6);
        if (b5 != 0) {
            c9514rr13.c(ec2.a(b5 + ec2.a), ec2.b);
        } else {
            c9514rr13 = null;
        }
        if (c9514rr13 != null) {
            TF0 tf03 = new TF0();
            int b6 = ec2.b(10);
            if (b6 != 0) {
                tf03.c(ec2.a(b6 + ec2.a), ec2.b);
            } else {
                tf03 = null;
            }
            if (tf03 != null) {
                C9514rr1 c9514rr14 = new C9514rr1();
                int b7 = ec2.b(6);
                if (b7 != 0) {
                    c9514rr14.c(ec2.a(b7 + ec2.a), ec2.b);
                } else {
                    c9514rr14 = null;
                }
                IntersectionCriteria n2 = RP0.n(c9514rr14);
                this.exitCriteria = n2;
                arrayList.add(n2);
                TF0 tf04 = new TF0();
                int b8 = ec2.b(10);
                if (b8 != 0) {
                    tf04.c(ec2.a(b8 + ec2.a), ec2.b);
                } else {
                    tf04 = null;
                }
                this.onExit = rp0.o(tf04, ((C2924Wn) this.commandEventData).i);
            }
        }
        int b9 = ec2.b(12);
        String d = b9 != 0 ? ec2.d(b9 + ec2.a) : null;
        this.groupKey = d == null ? "" : d;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public void criteriaMatched(ArrayList arrayList) {
        QP0 qp0;
        if (arrayList.isEmpty()) {
            return;
        }
        AbstractC9053qX commandEventDataWithView = commandEventDataWithView();
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
                    } else {
                        continue;
                    }
                }
            } else if (V82.a(intersectionCriteria, this.exitCriteria)) {
                if (this.hasEntered && (qp0 = this.onExit) != null) {
                    ((C10081tX) this.commandResolver).a(qp0.a(), commandEventDataWithView, 2).c();
                }
                this.hasEntered = false;
            }
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public ArrayList getCriteriaList() {
        return this.criteriaList;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public String getGroupId() {
        return this.groupKey;
    }
}
