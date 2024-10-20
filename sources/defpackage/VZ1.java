package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.ChromeTabbedActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VZ1 implements InterfaceC11179wj {
    public static VZ1 j;
    public final InterfaceC0079Ap3 a;
    public final KH g;
    public final C12157za2 h = new C12157za2();
    public boolean i;

    public VZ1(QZ1 qz1, KH kh) {
        ApplicationStatus.f(this);
        this.a = qz1;
        this.g = kh;
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        boolean z;
        int c;
        ComponentName componentName;
        if (i != 3 && i != 4 && i != 5) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = ((List) this.a.get()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.RecentTaskInfo d = AbstractC2599Ua.d((ActivityManager.AppTask) it.next());
            if (d != null && (componentName = d.baseActivity) != null) {
                String className = componentName.getClassName();
                this.g.getClass();
                if (TextUtils.equals(className, ChromeTabbedActivity.class.getName()) || TextUtils.equals(className, "com.google.android.apps.chrome.Main")) {
                    hashSet.add(Integer.valueOf(d.id));
                }
            }
        }
        if (hashSet.size() >= 2) {
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            Iterator it2 = ApplicationStatus.b().iterator();
            while (it2.hasNext()) {
                Activity activity2 = (Activity) it2.next();
                int taskId = activity2.getTaskId();
                if (hashSet.contains(Integer.valueOf(taskId)) && ((c = ApplicationStatus.c(activity2)) == 3 || c == 4)) {
                    sparseBooleanArray.put(taskId, true);
                }
            }
            if (sparseBooleanArray.size() > 1) {
                z = true;
            }
        }
        if (z == this.i) {
            return;
        }
        this.i = z;
        Iterator it3 = this.h.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it3;
            if (!c11814ya2.hasNext()) {
                return;
            }
            RZ1 rz1 = (RZ1) c11814ya2.next();
            boolean z2 = this.i;
            rz1.a.getClass();
            if (C7851n02.r()) {
                Q83 q83 = O83.a;
                long h = q83.h("Chrome.MultiInstance.StartTime");
                long currentTimeMillis = System.currentTimeMillis();
                if (h == 0 && z2) {
                    FI2.a("Android.MultiInstance.Enter");
                    q83.s(currentTimeMillis, "Chrome.MultiInstance.StartTime");
                } else if (h != 0 && !z2) {
                    FI2.a("Android.MultiInstance.Exit");
                    EI2.j(currentTimeMillis - h, "Android.MultiInstance.TotalDuration");
                    q83.s(0L, "Chrome.MultiInstance.StartTime");
                }
            }
        }
    }
}
