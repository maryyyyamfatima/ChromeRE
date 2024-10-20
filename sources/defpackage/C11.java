package defpackage;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class C11 extends H11 {
    public final Map g;
    public final /* synthetic */ I11 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11(I11 i11, HashMap hashMap) {
        super(i11);
        this.h = i11;
        this.g = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.H11
    public final void a() {
        InterfaceC3918ba3 interfaceC3918ba3;
        I11 i11 = this.h;
        C8886q11 c8886q11 = new C8886q11(i11.d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map map = this.g;
        for (InterfaceC3129Yc interfaceC3129Yc : map.keySet()) {
            interfaceC3129Yc.getClass();
            if (!((C11972z11) map.get(interfaceC3129Yc)).c) {
                arrayList.add(interfaceC3129Yc);
            } else {
                arrayList2.add(interfaceC3129Yc);
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        Context context = i11.c;
        int i = -1;
        if (isEmpty) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext() && (i = c8886q11.a(context, (InterfaceC3129Yc) it.next())) != 0) {
            }
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext() && (i = c8886q11.a(context, (InterfaceC3129Yc) it2.next())) == 0) {
            }
        }
        R11 r11 = i11.a;
        if (i != 0) {
            r11.i(new A11(this, i11, new ConnectionResult(i, null)));
            return;
        }
        if (i11.m && (interfaceC3918ba3 = i11.k) != null) {
            C4261ca3 c4261ca3 = (C4261ca3) interfaceC3918ba3;
            c4261ca3.o = new C7132kv(c4261ca3);
            c4261ca3.w(2, null);
        }
        for (InterfaceC3129Yc interfaceC3129Yc2 : map.keySet()) {
            InterfaceC6102hv interfaceC6102hv = (InterfaceC6102hv) map.get(interfaceC3129Yc2);
            interfaceC3129Yc2.getClass();
            if (c8886q11.a(context, interfaceC3129Yc2) != 0) {
                r11.i(new B11(i11, interfaceC6102hv));
            } else {
                BaseGmsClient baseGmsClient = (BaseGmsClient) interfaceC3129Yc2;
                baseGmsClient.o = interfaceC6102hv;
                baseGmsClient.w(2, null);
            }
        }
    }
}
