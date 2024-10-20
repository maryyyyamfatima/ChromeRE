package org.chromium.chrome.browser.tasks.tab_management;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.C1553Ly3;
import defpackage.FI2;
import defpackage.InterfaceC1034Hy3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class d extends View.AccessibilityDelegate {
    public final /* synthetic */ InterfaceC1034Hy3 a;
    public final /* synthetic */ C1553Ly3 b;

    public d(C1553Ly3 c1553Ly3, InterfaceC1034Hy3 interfaceC1034Hy3) {
        this.b = c1553Ly3;
        this.a = interfaceC1034Hy3;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TabListRecyclerView tabListRecyclerView = (TabListRecyclerView) this.a;
        tabListRecyclerView.getClass();
        ArrayList arrayList = new ArrayList();
        int J2 = RecyclerView.J(view);
        if (J2 != -1) {
            int i = ((GridLayoutManager) tabListRecyclerView.s).F;
            Context context = tabListRecyclerView.getContext();
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = new AccessibilityNodeInfo.AccessibilityAction(R.id.move_tab_left, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140167));
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = new AccessibilityNodeInfo.AccessibilityAction(R.id.move_tab_right, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140168));
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3 = new AccessibilityNodeInfo.AccessibilityAction(R.id.move_tab_up, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140169));
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4 = new AccessibilityNodeInfo.AccessibilityAction(R.id.move_tab_down, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140166));
            arrayList.addAll(new ArrayList(Arrays.asList(accessibilityAction, accessibilityAction2, accessibilityAction3, accessibilityAction4)));
            int i2 = J2 % i;
            if (i2 == 0) {
                arrayList.remove(accessibilityAction);
            } else if (i2 == i - 1) {
                arrayList.remove(accessibilityAction2);
            }
            if (J2 < i) {
                arrayList.remove(accessibilityAction3);
            }
            int i3 = 0;
            for (int i4 = 0; i4 < tabListRecyclerView.r.q(); i4++) {
                if (tabListRecyclerView.r.s(i4) == 1) {
                    i3++;
                }
            }
            if (i3 - J2 <= i) {
                arrayList.remove(accessibilityAction4);
            }
            int i5 = 0;
            for (int i6 = 0; i6 < tabListRecyclerView.r.q(); i6++) {
                if (tabListRecyclerView.r.s(i6) == 1) {
                    i5++;
                }
            }
            if (J2 == i5 - 1) {
                arrayList.remove(accessibilityAction2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) it.next());
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        TabListRecyclerView tabListRecyclerView = (TabListRecyclerView) this.a;
        tabListRecyclerView.getClass();
        if (!(i == R.id.move_tab_left || i == R.id.move_tab_right || i == R.id.move_tab_up || i == R.id.move_tab_down)) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        tabListRecyclerView.getClass();
        int J2 = RecyclerView.J(view);
        int i2 = ((GridLayoutManager) tabListRecyclerView.s).F;
        Pair pair = new Pair(Integer.valueOf(J2), Integer.valueOf(i == R.id.move_tab_left ? J2 - 1 : i == R.id.move_tab_right ? J2 + 1 : i == R.id.move_tab_up ? J2 - i2 : i == R.id.move_tab_down ? J2 + i2 : -1));
        int intValue = ((Integer) pair.first).intValue();
        int intValue2 = ((Integer) pair.second).intValue();
        C1553Ly3 c1553Ly3 = this.b;
        if (!c1553Ly3.k(intValue) || !c1553Ly3.k(intValue2)) {
            return false;
        }
        c1553Ly3.e.w(intValue, intValue2);
        FI2.a("TabGrid.AccessibilityDelegate.Reordered");
        return true;
    }
}
