package defpackage;

import android.app.Activity;
import android.util.SparseBooleanArray;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ee0 */
/* loaded from: classes.dex */
public final class C4969ee0 extends AbstractC0185Bl {
    public final Callback h;
    public HashSet i;
    public ArrayList j;
    public HashMap k;
    public final /* synthetic */ C5313fe0 l;

    /* JADX WARN: Removed duplicated region for block: B:18:0x009b A[LOOP:1: B:16:0x0095->B:18:0x009b, LOOP_END] */
    @Override // defpackage.AbstractC0185Bl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4969ee0.b():java.lang.Object");
    }

    @Override // defpackage.AbstractC0185Bl
    public final void j(Object obj) {
        synchronized (C5313fe0.f) {
            C5313fe0.g = null;
        }
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        C0129Az3 s1;
        ArrayList arrayList = new ArrayList();
        if (this.l.e) {
            this.h.onResult(arrayList);
            return;
        }
        if (this.i.isEmpty() && this.j.isEmpty()) {
            this.h.onResult(arrayList);
            return;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Object obj2 = ThreadUtils.a;
        Iterator it = ApplicationStatus.b().iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) it.next();
            if (activity instanceof AbstractActivityC1529Lu) {
                AbstractActivityC1529Lu abstractActivityC1529Lu = (AbstractActivityC1529Lu) activity;
                if (abstractActivityC1529Lu != null && (s1 = abstractActivityC1529Lu.s1()) != null) {
                    ArrayList arrayList2 = s1.a;
                    for (int i = 0; i < arrayList2.size(); i++) {
                        TabModel tabModel = (TabModel) arrayList2.get(i);
                        for (int i2 = 0; i2 < tabModel.getCount(); i2++) {
                            hashSet.add(Integer.valueOf(tabModel.getTabAt(i2).getId()));
                        }
                    }
                }
                hashSet2.add(Integer.valueOf(activity.getTaskId()));
            }
        }
        Iterator it2 = this.i.iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) it2.next();
            if (!hashSet.contains(num)) {
                arrayList.add(QA3.a(num.intValue(), false));
            }
        }
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            File file = (File) this.j.get(i3);
            String name = file.getName();
            Object obj3 = C9284rA3.z;
            try {
                if (!hashSet2.contains(Integer.valueOf(Integer.parseInt(name.substring(9))))) {
                    arrayList.add(file.getName());
                    SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.k.get(file);
                    if (sparseBooleanArray != null) {
                        for (int i4 = 0; i4 < sparseBooleanArray.size(); i4++) {
                            arrayList.add(QA3.a(sparseBooleanArray.keyAt(i4), false));
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        this.h.onResult(arrayList);
        synchronized (C5313fe0.f) {
            C5313fe0.g = null;
        }
    }

    public C4969ee0(C5313fe0 c5313fe0, C5506gA3 c5506gA3) {
        this.l = c5313fe0;
        this.h = c5506gA3;
    }
}
