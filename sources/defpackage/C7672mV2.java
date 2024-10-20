package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mV2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7672mV2 extends AbstractC4734dw1 implements InterfaceC6982kV0 {
    public final /* synthetic */ InterfaceC12177zd4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7672mV2(InterfaceC12177zd4 interfaceC12177zd4) {
        super(0);
        this.g = interfaceC12177zd4;
    }

    @Override // defpackage.InterfaceC6982kV0
    public final Object d() {
        AbstractC2080Qa0 abstractC2080Qa0;
        InterfaceC12177zd4 interfaceC12177zd4 = this.g;
        AbstractC0087Ar1.e(interfaceC12177zd4, "<this>");
        ArrayList arrayList = new ArrayList();
        AbstractC3842bL2.a.getClass();
        Class a = new KS(C8360oV2.class).a();
        AbstractC0087Ar1.c(a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new C10119td4(a));
        Object[] array = arrayList.toArray(new C10119td4[0]);
        AbstractC0087Ar1.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        C10119td4[] c10119td4Arr = (C10119td4[]) array;
        C10119td4[] c10119td4Arr2 = (C10119td4[]) Arrays.copyOf(c10119td4Arr, c10119td4Arr.length);
        AbstractC0087Ar1.e(c10119td4Arr2, "initializers");
        C11834yd4 w = interfaceC12177zd4.w();
        AbstractC0087Ar1.d(w, "owner.viewModelStore");
        if (interfaceC12177zd4 instanceof InterfaceC3762b61) {
            abstractC2080Qa0 = ((InterfaceC3762b61) interfaceC12177zd4).r();
            AbstractC0087Ar1.d(abstractC2080Qa0, "{\n        owner.defaultV…ModelCreationExtras\n    }");
        } else {
            abstractC2080Qa0 = C1950Pa0.b;
        }
        AbstractC0087Ar1.e(abstractC2080Qa0, "defaultCreationExtras");
        HashMap hashMap = w.a;
        AbstractC9776sd4 abstractC9776sd4 = (AbstractC9776sd4) hashMap.get("androidx.lifecycle.internal.SavedStateHandlesVM");
        if (C8360oV2.class.isInstance(abstractC9776sd4)) {
            AbstractC0087Ar1.c(abstractC9776sd4, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        } else {
            E02 e02 = new E02(abstractC2080Qa0);
            e02.a.put(C11148wd4.a, "androidx.lifecycle.internal.SavedStateHandlesVM");
            try {
                AbstractC9776sd4 abstractC9776sd42 = null;
                for (C10119td4 c10119td4 : c10119td4Arr2) {
                    if (AbstractC0087Ar1.a(c10119td4.a, C8360oV2.class)) {
                        Object b = c10119td4.b.b(e02);
                        abstractC9776sd42 = b instanceof AbstractC9776sd4 ? (AbstractC9776sd4) b : null;
                    }
                }
                if (abstractC9776sd42 != null) {
                    AbstractC9776sd4 abstractC9776sd43 = (AbstractC9776sd4) hashMap.put("androidx.lifecycle.internal.SavedStateHandlesVM", abstractC9776sd42);
                    if (abstractC9776sd43 != null) {
                        abstractC9776sd43.a();
                    }
                    abstractC9776sd4 = abstractC9776sd42;
                } else {
                    throw new IllegalArgumentException("No initializer set for given class ".concat(C8360oV2.class.getName()));
                }
            } catch (AbstractMethodError unused) {
                throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            }
        }
        return (C8360oV2) abstractC9776sd4;
    }
}
