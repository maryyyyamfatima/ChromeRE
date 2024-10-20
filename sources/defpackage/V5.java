package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V5 extends U5 {
    @Override // defpackage.U5
    public final Intent a(AbstractActivityC6817k00 abstractActivityC6817k00, Object obj) {
        String[] strArr = (String[]) obj;
        AbstractC0087Ar1.e(abstractActivityC6817k00, "context");
        AbstractC0087Ar1.e(strArr, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        AbstractC0087Ar1.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // defpackage.U5
    public final T5 b(AbstractActivityC6817k00 abstractActivityC6817k00, Object obj) {
        String[] strArr = (String[]) obj;
        AbstractC0087Ar1.e(abstractActivityC6817k00, "context");
        AbstractC0087Ar1.e(strArr, "input");
        boolean z = true;
        if (strArr.length == 0) {
            return new T5(C9281rA0.a);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!(Y50.a(abstractActivityC6817k00, strArr[i]) == 0)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            return null;
        }
        int a = AbstractC3846bM1.a(strArr.length);
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (String str : strArr) {
            linkedHashMap.put(str, Boolean.TRUE);
        }
        return new T5(linkedHashMap);
    }

    @Override // defpackage.U5
    public final Object c(Intent intent, int i) {
        C9281rA0 c9281rA0 = C9281rA0.a;
        if (i != -1 || intent == null) {
            return c9281rA0;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return c9281rA0;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : stringArrayExtra) {
            if (str != null) {
                arrayList2.add(str);
            }
        }
        Iterator it = arrayList2.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList3 = new ArrayList(Math.min(arrayList2.size(), arrayList.size()));
        while (it.hasNext() && it2.hasNext()) {
            arrayList3.add(new C8089ni2(it.next(), it2.next()));
        }
        return AbstractC4189cM1.c(arrayList3);
    }
}
