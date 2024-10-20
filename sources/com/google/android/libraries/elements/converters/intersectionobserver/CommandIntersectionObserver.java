package com.google.android.libraries.elements.converters.intersectionobserver;

import defpackage.AbstractC9053qX;
import defpackage.C10081tX;
import defpackage.C11110wX;
import defpackage.C2924Wn;
import defpackage.C9514rr1;
import defpackage.InterfaceC9738sX;
import defpackage.QP0;
import defpackage.RP0;
import defpackage.TF0;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CommandIntersectionObserver extends IntersectionObserver {
    private final QP0 commandFuture;
    private final InterfaceC9738sX commandResolver;
    private final ArrayList criteriaList;

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public String getGroupId() {
        return "";
    }

    public CommandIntersectionObserver(C11110wX c11110wX, InterfaceC9738sX interfaceC9738sX, AbstractC9053qX abstractC9053qX, RP0 rp0) {
        super(abstractC9053qX);
        this.commandResolver = interfaceC9738sX;
        c11110wX.getClass();
        C9514rr1 c9514rr1 = new C9514rr1();
        int b = c11110wX.b(4);
        TF0 tf0 = null;
        if (b != 0) {
            c9514rr1.c(c11110wX.a(b + c11110wX.a), c11110wX.b);
        } else {
            c9514rr1 = null;
        }
        ArrayList arrayList = new ArrayList();
        this.criteriaList = arrayList;
        if (c9514rr1 == null) {
            this.commandFuture = null;
            return;
        }
        arrayList.add(RP0.n(c9514rr1));
        TF0 tf02 = new TF0();
        int b2 = c11110wX.b(6);
        if (b2 != 0) {
            tf02.c(c11110wX.a(b2 + c11110wX.a), c11110wX.b);
            tf0 = tf02;
        }
        this.commandFuture = rp0.o(tf0, ((C2924Wn) this.commandEventData).i);
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public void criteriaMatched(ArrayList arrayList) {
        QP0 qp0 = this.commandFuture;
        if (qp0 != null) {
            ((C10081tX) this.commandResolver).a(qp0.a(), commandEventDataWithView(), 2).c();
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public ArrayList getCriteriaList() {
        return this.criteriaList;
    }
}
