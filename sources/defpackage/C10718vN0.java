package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import com.android.chrome.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.chromium.base.Callback;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vN0 */
/* loaded from: classes.dex */
public final class C10718vN0 implements InterfaceC4953eb2 {
    public final Context a;
    public final C11061wN0 g;
    public final InterfaceC5297fb2 h;
    public final Handler i = new Handler();
    public final C7616mK1 j;
    public final C7616mK1 k;

    @Override // defpackage.InterfaceC4953eb2
    public final /* synthetic */ void c() {
    }

    public C10718vN0(Context context, C11061wN0 c11061wN0, C6134i03 c6134i03) {
        C7616mK1 c7616mK1 = new C7616mK1();
        this.j = c7616mK1;
        this.k = new C7616mK1();
        this.a = context;
        this.g = c11061wN0;
        this.h = c6134i03;
        Callback callback = new Callback() { // from class: uN0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C10718vN0 c10718vN0 = C10718vN0.this;
                c10718vN0.getClass();
                c10718vN0.g(((PropertyModel) obj).h(OK.e));
                ND2 nd2 = BN0.b;
                C12090zN0 c12090zN0 = c10718vN0.g.a;
                c12090zN0.a(c12090zN0.b.h(nd2));
            }
        };
        C7272lK1 a = VK.a(0, R.drawable.0_resource_name_obfuscated_res_0x7f090485, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140435), callback);
        C7272lK1 a2 = VK.a(2, R.drawable.0_resource_name_obfuscated_res_0x7f090336, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140441), callback);
        C7272lK1 a3 = VK.a(3, R.drawable.0_resource_name_obfuscated_res_0x7f0902e7, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140436), callback);
        C7272lK1 a4 = VK.a(4, R.drawable.0_resource_name_obfuscated_res_0x7f0901f1, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140439), callback);
        C7272lK1 a5 = VK.a(1, R.drawable.0_resource_name_obfuscated_res_0x7f090212, context.getString(R.string.0_resource_name_obfuscated_res_0x7f14043c), callback);
        C7272lK1 a6 = VK.a(6, R.drawable.0_resource_name_obfuscated_res_0x7f0901f0, context.getString(R.string.0_resource_name_obfuscated_res_0x7f14043b), callback);
        a.b.k(OK.f, true);
        c7616mK1.s(a);
        c7616mK1.s(a2);
        c7616mK1.s(a3);
        c7616mK1.s(a4);
        c7616mK1.s(a5);
        c7616mK1.s(a6);
        c6134i03.a(this);
        a();
    }

    public final void g(int i) {
        int i2 = 0;
        while (true) {
            C7616mK1 c7616mK1 = this.j;
            if (i2 >= c7616mK1.size()) {
                return;
            }
            PropertyModel propertyModel = ((C7272lK1) c7616mK1.get(i2)).b;
            propertyModel.k(OK.f, propertyModel.h(OK.e) == i);
            i2++;
        }
    }

    public final int f() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            C7272lK1 c7272lK1 = (C7272lK1) it.next();
            if (c7272lK1.b.j(OK.f)) {
                return c7272lK1.b.h(OK.e);
            }
        }
        return 0;
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void b(Collection collection) {
        this.i.post(new Runnable() { // from class: sN0
            @Override // java.lang.Runnable
            public final void run() {
                C10718vN0.this.a();
            }
        });
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void d(Collection collection) {
        this.i.post(new Runnable() { // from class: tN0
            @Override // java.lang.Runnable
            public final void run() {
                C10718vN0.this.a();
            }
        });
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void e(OfflineItem offlineItem, OfflineItem offlineItem2) {
        if (offlineItem.i == offlineItem2.i) {
            return;
        }
        this.i.post(new Runnable() { // from class: rN0
            @Override // java.lang.Runnable
            public final void run() {
                C10718vN0.this.a();
            }
        });
    }

    public final void a() {
        LD2 ld2;
        String quantityString;
        HashMap hashMap = new HashMap();
        Iterator it = this.h.h().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            int intValue = HN0.a((OfflineItem) it.next()).intValue();
            if (hashMap.containsKey(Integer.valueOf(intValue))) {
                i = ((Integer) hashMap.get(Integer.valueOf(intValue))).intValue();
            }
            hashMap.put(Integer.valueOf(intValue), Integer.valueOf(i + 1));
        }
        int i2 = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Integer) entry.getKey()).intValue() != 7) {
                i2 += ((Integer) entry.getValue()).intValue();
            }
        }
        hashMap.put(0, Integer.valueOf(i2));
        C7616mK1 c7616mK1 = this.j;
        Iterator it2 = c7616mK1.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            ld2 = OK.c;
            if (!hasNext) {
                break;
            }
            C7272lK1 c7272lK1 = (C7272lK1) it2.next();
            int h = c7272lK1.b.h(OK.e);
            boolean containsKey = hashMap.containsKey(Integer.valueOf(h));
            PropertyModel propertyModel = c7272lK1.b;
            propertyModel.k(ld2, containsKey);
            if (propertyModel.j(ld2)) {
                PD2 pd2 = OK.b;
                Resources resources = this.a.getResources();
                int intValue2 = ((Integer) hashMap.get(Integer.valueOf(h))).intValue();
                int i3 = AbstractC7853n04.a;
                if (h == 0) {
                    quantityString = resources.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120003, intValue2, Integer.valueOf(intValue2));
                } else if (h == 1) {
                    quantityString = resources.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120005, intValue2, Integer.valueOf(intValue2));
                } else if (h == 2) {
                    quantityString = resources.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120006, intValue2, Integer.valueOf(intValue2));
                } else if (h == 3) {
                    quantityString = resources.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120002, intValue2, Integer.valueOf(intValue2));
                } else if (h == 4) {
                    quantityString = resources.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120004, intValue2, Integer.valueOf(intValue2));
                } else {
                    quantityString = h != 6 ? null : resources.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120003, intValue2, Integer.valueOf(intValue2));
                }
                propertyModel.o(pd2, quantityString);
            }
        }
        C7616mK1 c7616mK12 = this.k;
        c7616mK12.clear();
        Iterator it3 = c7616mK1.iterator();
        while (it3.hasNext()) {
            C7272lK1 c7272lK12 = (C7272lK1) it3.next();
            if (c7272lK12.b.j(ld2)) {
                c7616mK12.s(c7272lK12);
            }
        }
        if (c7616mK12.size() <= 2) {
            c7616mK12.clear();
        }
        Iterator it4 = c7616mK1.iterator();
        while (it4.hasNext()) {
            C7272lK1 c7272lK13 = (C7272lK1) it4.next();
            if (c7272lK13.b.j(OK.f) && !c7272lK13.b.j(ld2)) {
                g(0);
                ND2 nd2 = BN0.b;
                C12090zN0 c12090zN0 = this.g.a;
                c12090zN0.a(c12090zN0.b.h(nd2));
                return;
            }
        }
    }
}
