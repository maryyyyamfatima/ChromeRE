package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EL3 extends AbstractC1649Ms {
    public final /* synthetic */ FL3 h;

    public EL3(FL3 fl3) {
        this.h = fl3;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        boolean z;
        CL3 cl3;
        FL3 fl3 = this.h;
        int i = 1;
        if (fl3.b != null) {
            return null;
        }
        Object obj = ThreadUtils.a;
        Context context = V60.a;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getPath());
        File file = new File(Y5.a(sb, File.separator, "thumbnails"));
        fl3.b = file;
        if (!file.exists()) {
            try {
                z = fl3.b.mkdir();
            } catch (SecurityException e) {
                AbstractC4851eH1.a("ThumbnailStorage", "Error while creating thumbnails directory.", e);
                z = false;
            }
            if (!z) {
                return null;
            }
        }
        File[] listFiles = fl3.b.listFiles();
        if (listFiles == null) {
            return null;
        }
        int i2 = 0;
        for (File file2 : listFiles) {
            try {
                byte[] d = new C0575El(file2).d();
                CL3 cl32 = CL3.n;
                int length = d.length;
                XF0 c = XF0.c();
                CL3 cl33 = CL3.n;
                cl3 = new CL3();
                try {
                    try {
                        C7931nE2 c7931nE2 = C7931nE2.c;
                        c7931nE2.getClass();
                        QW2 b = c7931nE2.b(cl3.getClass());
                        b.f(cl3, d, 0, i2 + length, new C2254Rj(c));
                        b.b(cl3);
                    } catch (IndexOutOfBoundsException unused) {
                        throw C1127Ir1.h();
                    } catch (C6827k14 e2) {
                        throw e2.a();
                    }
                } catch (C1127Ir1 e3) {
                    if (e3.g) {
                        throw new C1127Ir1(e3);
                    }
                    throw e3;
                } catch (IOException e4) {
                    if (e4.getCause() instanceof C1127Ir1) {
                        throw ((C1127Ir1) e4.getCause());
                    }
                    throw new C1127Ir1(e4);
                }
            } catch (IOException e5) {
                e = e5;
            }
            if (cl3.a != 0) {
                throw new RuntimeException();
                break;
            }
            try {
                QX0.i(cl3);
                int i3 = cl3.j;
                if ((i3 & 1) != 0) {
                    AL3 al3 = cl3.k;
                    if (al3 == null) {
                        al3 = AL3.l;
                    }
                    String str = al3.k;
                    if ((i3 & 2) != 0) {
                        int i4 = cl3.l;
                        FL3.g.add(new C8776pi2(str, Integer.valueOf(i4)));
                        HashMap hashMap = FL3.h;
                        if (hashMap.containsKey(str)) {
                            ((HashSet) hashMap.get(str)).add(Integer.valueOf(i4));
                        } else {
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(i4));
                            hashMap.put(str, hashSet);
                        }
                        fl3.e += file2.length();
                    }
                }
                i2 = 0;
                i = 1;
            } catch (IOException e6) {
                e = e6;
                i = 1;
            }
            e = e6;
            i = 1;
            Object[] objArr = new Object[i];
            objArr[0] = e;
            AbstractC4851eH1.a("ThumbnailStorage", "Error while reading from disk.", objArr);
            i2 = 0;
        }
        AbstractC10254u04.a.c((int) (fl3.e / 1024), 1000, 500000, 50, "Android.ThumbnailDiskStorage.Size");
        return null;
    }
}
