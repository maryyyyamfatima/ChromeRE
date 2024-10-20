package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ed0 */
/* loaded from: classes.dex */
public final class C4963ed0 extends C3159Yi {
    public final boolean A;
    public final boolean B;
    public final List C;
    public final HashMap D;
    public final HashMap E;
    public final B84 u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    @Override // defpackage.C3159Yi
    public final int h() {
        return R.menu.0_resource_name_obfuscated_res_0x7f100002;
    }

    public C4963ed0(Context context, C6166i6 c6166i6, C7507m02 c7507m02, C0129Az3 c0129Az3, C9707sQ3 c9707sQ3, View view, C8385oa2 c8385oa2, B84 b84, int i, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(context, c6166i6, c7507m02, c0129Az3, c9707sQ3, view, null, null, c8385oa2, null);
        this.D = new HashMap();
        this.E = new HashMap();
        this.u = b84;
        this.v = i;
        this.C = list;
        this.z = z;
        this.w = z2;
        this.x = z3;
        this.y = z4;
        this.A = z5;
        this.B = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b A[LOOP:0: B:39:0x0143->B:41:0x014b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    @Override // defpackage.C3159Yi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(android.view.Menu r12, defpackage.InterfaceC0950Hi r13) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4963ed0.m(android.view.Menu, Hi):void");
    }

    @Override // defpackage.C3159Yi, defpackage.InterfaceC2379Si
    public final List b() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.C3159Yi, defpackage.InterfaceC2379Si
    public final Bundle g(int i) {
        Bundle g = super.g(i);
        HashMap hashMap = this.E;
        if (!hashMap.containsKey(Integer.valueOf(i))) {
            return g;
        }
        g.putInt("CustomMenuItemId", ((Integer) hashMap.get(Integer.valueOf(i))).intValue());
        return g;
    }

    @Override // defpackage.C3159Yi, defpackage.InterfaceC2379Si
    public final int a() {
        int i = this.v;
        if (i == 1 || i == 5) {
            return 0;
        }
        return R.layout.0_resource_name_obfuscated_res_0x7f0e0201;
    }

    @Override // defpackage.C3159Yi, defpackage.InterfaceC2379Si
    public final void d(C1340Ki c1340Ki, View view) {
        TextView textView = (TextView) view.findViewById(R.id.running_in_chrome_footer_text);
        if (textView != null) {
            textView.setText(view.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140b6c, view.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1401f5)));
        }
    }

    @Override // defpackage.C3159Yi, defpackage.InterfaceC2379Si
    public final boolean f() {
        return this.B;
    }
}
