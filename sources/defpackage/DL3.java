package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DL3 extends AbstractC1649Ms {
    public final String h;
    public final Bitmap i;
    public final int j;
    public final /* synthetic */ FL3 k;

    public DL3(FL3 fl3, String str, Bitmap bitmap, int i) {
        this.k = fl3;
        this.h = str;
        this.i = bitmap;
        this.j = i;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        C0575El c0575El;
        FileOutputStream fileOutputStream;
        Bitmap bitmap = this.i;
        FL3 fl3 = this.k;
        fl3.getClass();
        Object obj = ThreadUtils.a;
        if (fl3.b != null) {
            LinkedHashSet linkedHashSet = FL3.g;
            int i = this.j;
            Integer valueOf = Integer.valueOf(i);
            String str = this.h;
            if (linkedHashSet.contains(new C8776pi2(str, valueOf))) {
                fl3.c(new C8776pi2(str, Integer.valueOf(i)));
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                BL3 bl3 = (BL3) CL3.n.j();
                C12083zL3 c12083zL3 = (C12083zL3) AL3.l.j();
                if (c12083zL3.h) {
                    c12083zL3.l();
                    c12083zL3.h = false;
                }
                AL3 al3 = (AL3) c12083zL3.g;
                al3.getClass();
                str.getClass();
                al3.j |= 1;
                al3.k = str;
                if (bl3.h) {
                    bl3.l();
                    bl3.h = false;
                }
                CL3 cl3 = (CL3) bl3.g;
                AL3 al32 = (AL3) c12083zL3.j();
                cl3.getClass();
                al32.getClass();
                cl3.k = al32;
                cl3.j |= 1;
                if (bl3.h) {
                    bl3.l();
                    bl3.h = false;
                }
                CL3 cl32 = (CL3) bl3.g;
                cl32.j |= 2;
                cl32.l = i;
                ZD d = AbstractC4147cE.d(byteArray);
                if (bl3.h) {
                    bl3.l();
                    bl3.h = false;
                }
                CL3 cl33 = (CL3) bl3.g;
                cl33.getClass();
                cl33.j |= 4;
                cl33.m = d;
                CL3 cl34 = (CL3) bl3.j();
                File file = new File(fl3.b(i, str));
                c0575El = new C0575El(file);
                try {
                    fileOutputStream = c0575El.f();
                    try {
                        fileOutputStream.write(cl34.toByteArray());
                        c0575El.b(fileOutputStream);
                        linkedHashSet.add(new C8776pi2(str, Integer.valueOf(i)));
                        HashMap hashMap = FL3.h;
                        if (hashMap.containsKey(str)) {
                            ((HashSet) hashMap.get(str)).add(Integer.valueOf(i));
                        } else {
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(i));
                            hashMap.put(str, hashSet);
                        }
                        fl3.e += file.length();
                        while (fl3.e > fl3.d) {
                            fl3.c((C8776pi2) linkedHashSet.iterator().next());
                        }
                    } catch (IOException e) {
                        e = e;
                        AbstractC4851eH1.a("ThumbnailStorage", "Error while writing to disk.", e);
                        c0575El.a(fileOutputStream);
                        return null;
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = null;
                }
            } catch (IOException e3) {
                e = e3;
                c0575El = null;
                fileOutputStream = null;
            }
        }
        return null;
    }
}
