package com.google.android.libraries.elements.converters;

import com.google.android.libraries.elements.interfaces.CollectionDataSource;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.AbstractC0562Ei1;
import defpackage.AbstractC6726jk3;
import defpackage.C6383ik3;
import defpackage.SY;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class f extends AbstractC6726jk3 {

    @SY(type = JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE)
    AbstractC0562Ei1 a;

    @SY(type = 13)
    Boolean b;

    @Override // defpackage.AbstractC6726jk3
    public final void a(C6383ik3 c6383ik3) {
        Object[] objArr = c6383ik3.b;
        int i = c6383ik3.a;
        if (i == 0) {
            AbstractC0562Ei1 o = AbstractC0562Ei1.o(((CollectionDataSource) objArr[0]).identifiers());
            this.b = Boolean.FALSE;
            this.a = o;
        } else {
            if (i != 1) {
                return;
            }
            Boolean bool = this.b;
            AbstractC0562Ei1 abstractC0562Ei1 = this.a;
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            if (abstractC0562Ei1 != null) {
                ArrayList arrayList = new ArrayList(abstractC0562Ei1);
                arrayList.add(intValue2, (String) arrayList.remove(intValue));
                abstractC0562Ei1 = AbstractC0562Ei1.o(arrayList);
                bool = Boolean.TRUE;
            }
            this.b = bool;
            this.a = abstractC0562Ei1;
        }
    }
}
