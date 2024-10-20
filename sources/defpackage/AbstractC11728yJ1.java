package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11728yJ1 {
    public static final HashMap a = new HashMap();
    public static final C3804bE b;

    public static RJ1 a(String str, Callable callable) {
        C8985qJ1 c8985qJ1 = str == null ? null : (C8985qJ1) C9327rJ1.b.a.b(str);
        if (c8985qJ1 != null) {
            return new RJ1(new CallableC11385xJ1(c8985qJ1), false);
        }
        HashMap hashMap = a;
        if (str == null || !hashMap.containsKey(str)) {
            RJ1 rj1 = new RJ1(callable, false);
            if (str != null) {
                C9670sJ1 c9670sJ1 = new C9670sJ1(str);
                synchronized (rj1) {
                    if (rj1.d != null && rj1.d.a != null) {
                        c9670sJ1.onResult(rj1.d.a);
                    }
                    rj1.a.add(c9670sJ1);
                }
                C10013tJ1 c10013tJ1 = new C10013tJ1(str);
                synchronized (rj1) {
                    if (rj1.d != null && rj1.d.b != null) {
                        c10013tJ1.onResult(rj1.d.b);
                    }
                    rj1.b.add(c10013tJ1);
                }
                hashMap.put(str, rj1);
            }
            return rj1;
        }
        return (RJ1) hashMap.get(str);
    }

    static {
        byte[] copyOf = Arrays.copyOf(new byte[]{80, 75, 3, 4}, 4);
        AbstractC0087Ar1.d(copyOf, "copyOf(this, size)");
        b = new C3804bE(copyOf);
    }

    public static OJ1 b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return c(context.getAssets().open(str), str2);
            }
            return f(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new OJ1(e);
        }
    }

    public static OJ1 e(int i, Context context, String str) {
        Boolean bool;
        C3804bE c3804bE;
        boolean z;
        long c;
        try {
            XH2 xh2 = new XH2(AbstractC2477Tb2.a(context.getResources().openRawResource(i)));
            try {
                c3804bE = b;
                AbstractC0087Ar1.e(c3804bE, "bytes");
                z = true;
            } catch (Exception unused) {
                AbstractC5888hI1.a.getClass();
                bool = Boolean.FALSE;
            }
            if (!(!xh2.h)) {
                throw new IllegalStateException("closed".toString());
            }
            long j = 0;
            while (true) {
                C5173fD c5173fD = xh2.g;
                c = c5173fD.c(c3804bE, j);
                if (c != -1) {
                    break;
                }
                long j2 = c5173fD.g;
                if (xh2.a.Z0(c5173fD, 8192L) == -1) {
                    c = -1;
                    break;
                }
                j = Math.max(j, (j2 - c3804bE.a.length) + 1);
            }
            if (c != 0) {
                z = false;
            }
            bool = Boolean.valueOf(z);
            if (bool.booleanValue()) {
                return f(new ZipInputStream(new WH2(xh2)), str);
            }
            return c(new WH2(xh2), str);
        } catch (Resources.NotFoundException e) {
            return new OJ1(e);
        }
    }

    public static String h(Context context, int i) {
        return "rawRes" + ((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_") + i;
    }

    public static OJ1 c(InputStream inputStream, String str) {
        try {
            XH2 xh2 = new XH2(AbstractC2477Tb2.a(inputStream));
            String[] strArr = AbstractC3086Xt1.j;
            return d(new C3346Zt1(xh2), str, true);
        } finally {
            C74.b(inputStream);
        }
    }

    public static OJ1 d(C3346Zt1 c3346Zt1, String str, boolean z) {
        try {
            try {
                C8985qJ1 a2 = AbstractC12071zJ1.a(c3346Zt1);
                if (str != null) {
                    C9327rJ1.b.a.c(str, a2);
                }
                OJ1 oj1 = new OJ1(a2);
                if (z) {
                    C74.b(c3346Zt1);
                }
                return oj1;
            } catch (Exception e) {
                OJ1 oj12 = new OJ1(e);
                if (z) {
                    C74.b(c3346Zt1);
                }
                return oj12;
            }
        } catch (Throwable th) {
            if (z) {
                C74.b(c3346Zt1);
            }
            throw th;
        }
    }

    public static OJ1 f(ZipInputStream zipInputStream, String str) {
        try {
            return g(zipInputStream, str);
        } finally {
            C74.b(zipInputStream);
        }
    }

    public static OJ1 g(ZipInputStream zipInputStream, String str) {
        LJ1 lj1;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C8985qJ1 c8985qJ1 = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    XH2 xh2 = new XH2(AbstractC2477Tb2.a(zipInputStream));
                    String[] strArr = AbstractC3086Xt1.j;
                    c8985qJ1 = (C8985qJ1) d(new C3346Zt1(xh2), null, false).a;
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split("/")[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (c8985qJ1 == null) {
                return new OJ1(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator it = c8985qJ1.d.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        lj1 = null;
                        break;
                    }
                    lj1 = (LJ1) it.next();
                    if (lj1.c.equals(str2)) {
                        break;
                    }
                }
                if (lj1 != null) {
                    Bitmap bitmap = (Bitmap) entry.getValue();
                    C11325x74 c11325x74 = C74.a;
                    int width = bitmap.getWidth();
                    int i = lj1.a;
                    int i2 = lj1.b;
                    if (width != i || bitmap.getHeight() != i2) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                        bitmap.recycle();
                        bitmap = createScaledBitmap;
                    }
                    lj1.d = bitmap;
                }
            }
            for (Map.Entry entry2 : c8985qJ1.d.entrySet()) {
                if (((LJ1) entry2.getValue()).d == null) {
                    return new OJ1(new IllegalStateException(AbstractC4809e90.a("There is no image for ", ((LJ1) entry2.getValue()).c)));
                }
            }
            if (str != null) {
                C9327rJ1.b.a.c(str, c8985qJ1);
            }
            return new OJ1(c8985qJ1);
        } catch (IOException e) {
            return new OJ1(e);
        }
    }
}
