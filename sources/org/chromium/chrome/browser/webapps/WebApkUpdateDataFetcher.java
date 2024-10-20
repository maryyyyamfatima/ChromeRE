package org.chromium.chrome.browser.webapps;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.chrome.R;
import defpackage.AbstractC7071kk4;
import defpackage.BA0;
import defpackage.Ik4;
import defpackage.Jn4;
import defpackage.Kn4;
import defpackage.Qk4;
import defpackage.V60;
import defpackage.Wj4;
import defpackage.Wk4;
import java.util.ArrayList;
import java.util.HashMap;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WebApkUpdateDataFetcher extends BA0 {
    public long a;
    public Tab g;
    public Kn4 h;
    public Qk4 i;

    public void onDataAvailable(String str, String str2, String str3, String str4, String str5, String str6, String str7, Bitmap bitmap, boolean z, String str8, String str9, Bitmap bitmap2, boolean z2, String[] strArr, int i, int i2, long j, long j2, String str10, String str11, String str12, boolean z3, boolean z4, String[] strArr2, String[][] strArr3, String[][] strArr4, byte[][] bArr) {
        Context context = V60.a;
        HashMap hashMap = new HashMap();
        int length = strArr.length;
        int i3 = 0;
        while (true) {
            String str13 = null;
            if (i3 >= length) {
                break;
            }
            String str14 = strArr[i3];
            if (str14.equals(str6)) {
                str13 = str7;
            } else if (str14.equals(str8)) {
                str13 = str9;
            }
            hashMap.put(str14, str13);
            i3++;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < strArr4.length; i4++) {
            String[] strArr5 = strArr4[i4];
            arrayList.add(new Wj4(strArr5[0], strArr5[1], strArr5[2], strArr5[3], strArr5[4], new Jn4(bArr[i4])));
        }
        ((Wk4) this.i).h(AbstractC7071kk4.c(new Intent(), this.h.s(), str2, new Jn4(bitmap), new Jn4(bitmap2), str3, str4, i, i2, this.h.f().i, j, j2, context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0708c7, null), z, z2, this.h.t(), this.h.e().d, this.h.m(), str, str5, this.h.a(), 0, hashMap, !TextUtils.isEmpty(str10) ? new Ik4(str10, str11, str12, z3, z4, strArr2, strArr3) : null, this.h.f().n, this.h.e().l, null, arrayList, this.h.e().n), str6, str8);
    }

    @Override // defpackage.BA0
    public final void T0(Tab tab, boolean z, boolean z2) {
        N.M_a8xBBL(this.a, this, this.g.b());
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        N.M_a8xBBL(this.a, this, this.g.b());
    }
}
