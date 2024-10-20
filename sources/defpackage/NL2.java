package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.a;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class NL2 {
    public static LL2 a(a aVar, List list, AbstractC7392lh abstractC7392lh) {
        RO2 dd;
        RO2 c2013Pm3;
        int i;
        InterfaceC11610xy interfaceC11610xy = aVar.a;
        BZ0 bz0 = aVar.h;
        Context applicationContext = bz0.getApplicationContext();
        NZ0 nz0 = bz0.h;
        LL2 ll2 = new LL2();
        C1346Kj0 c1346Kj0 = new C1346Kj0();
        C1077Ih1 c1077Ih1 = ll2.g;
        synchronized (c1077Ih1) {
            c1077Ih1.a.add(c1346Kj0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            LE0 le0 = new LE0();
            C1077Ih1 c1077Ih12 = ll2.g;
            synchronized (c1077Ih12) {
                c1077Ih12.a.add(le0);
            }
        }
        Resources resources = applicationContext.getResources();
        ArrayList d = ll2.d();
        C3492aK1 c3492aK1 = aVar.i;
        MD md = new MD(applicationContext, d, interfaceC11610xy, c3492aK1);
        RO2 p94 = new P94(interfaceC11610xy, new N94());
        C8840pt0 c8840pt0 = new C8840pt0(ll2.d(), resources.getDisplayMetrics(), interfaceC11610xy, c3492aK1);
        if (i2 < 28 || !nz0.a.containsKey(AbstractC10435uZ0.class)) {
            dd = new DD(c8840pt0);
            c2013Pm3 = new C2013Pm3(c8840pt0, c3492aK1);
        } else {
            c2013Pm3 = new C0712Fm1();
            dd = new FD();
        }
        if (i2 >= 28) {
            i = i2;
            ll2.a(new C11480xc(new C11823yc(d, c3492aK1)), InputStream.class, Drawable.class, "Animation");
            ll2.a(new C11137wc(new C11823yc(d, c3492aK1)), ByteBuffer.class, Drawable.class, "Animation");
        } else {
            i = i2;
        }
        UO2 uo2 = new UO2(applicationContext);
        InterfaceC8374oY1 c4205cP2 = new C4205cP2(resources);
        InterfaceC8374oY1 c4549dP2 = new C4549dP2(resources);
        InterfaceC8374oY1 c3518aP2 = new C3518aP2(resources);
        InterfaceC8374oY1 zo2 = new ZO2(resources);
        C8181ny c8181ny = new C8181ny(c3492aK1);
        C5431fy c5431fy = new C5431fy();
        C5628gZ0 c5628gZ0 = new C5628gZ0();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        GD gd = new GD();
        OA0 oa0 = ll2.b;
        synchronized (oa0) {
            oa0.a.add(new NA0(ByteBuffer.class, gd));
        }
        C2143Qm3 c2143Qm3 = new C2143Qm3(c3492aK1);
        OA0 oa02 = ll2.b;
        synchronized (oa02) {
            oa02.a.add(new NA0(InputStream.class, c2143Qm3));
        }
        ll2.a(dd, ByteBuffer.class, Bitmap.class, "Bitmap");
        ll2.a(c2013Pm3, InputStream.class, Bitmap.class, "Bitmap");
        String str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
            ll2.a(new C2122Qi2(c8840pt0), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        }
        ll2.a(p94, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        ll2.a(new P94(interfaceC11610xy, new I94()), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        InterfaceC8374oY1 interfaceC8374oY1 = C9917t14.a;
        ll2.c(Bitmap.class, Bitmap.class, interfaceC8374oY1);
        ll2.a(new C9231r14(), Bitmap.class, Bitmap.class, "Bitmap");
        ll2.b(Bitmap.class, c8181ny);
        ll2.a(new C6805jy(resources, dd), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        ll2.a(new C6805jy(resources, c2013Pm3), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        ll2.a(new C6805jy(resources, p94), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        ll2.b(BitmapDrawable.class, new C7149ky(interfaceC11610xy, c8181ny));
        ll2.a(new C2273Rm3(d, md, c3492aK1), InputStream.class, C5284fZ0.class, "Animation");
        ll2.a(md, ByteBuffer.class, C5284fZ0.class, "Animation");
        ll2.b(C5284fZ0.class, new C5972hZ0());
        ll2.c(InterfaceC4597dZ0.class, InterfaceC4597dZ0.class, interfaceC8374oY1);
        ll2.a(new C8721pZ0(interfaceC11610xy), InterfaceC4597dZ0.class, Bitmap.class, "Bitmap");
        ll2.a(uo2, Uri.class, Drawable.class, "legacy_append");
        ll2.a(new NO2(uo2, interfaceC11610xy), Uri.class, Bitmap.class, "legacy_append");
        ll2.g(new ND());
        ll2.c(File.class, ByteBuffer.class, new ID());
        ll2.c(File.class, InputStream.class, new AM0());
        ll2.a(new C7969nM0(), File.class, File.class, "legacy_append");
        ll2.c(File.class, ParcelFileDescriptor.class, new C11056wM0());
        ll2.c(File.class, File.class, interfaceC8374oY1);
        ll2.g(new C0842Gm1(c3492aK1));
        if (!"robolectric".equals(str)) {
            ll2.g(new C2252Ri2());
        }
        Class cls = Integer.TYPE;
        ll2.c(cls, InputStream.class, c4205cP2);
        ll2.c(cls, ParcelFileDescriptor.class, c3518aP2);
        ll2.c(Integer.class, InputStream.class, c4205cP2);
        ll2.c(Integer.class, ParcelFileDescriptor.class, c3518aP2);
        ll2.c(Integer.class, Uri.class, c4549dP2);
        ll2.c(cls, AssetFileDescriptor.class, zo2);
        ll2.c(Integer.class, AssetFileDescriptor.class, zo2);
        ll2.c(cls, Uri.class, c4549dP2);
        ll2.c(String.class, InputStream.class, new C0161Bg0());
        ll2.c(Uri.class, InputStream.class, new C0161Bg0());
        ll2.c(String.class, InputStream.class, new C9835sn3());
        ll2.c(String.class, ParcelFileDescriptor.class, new C9492rn3());
        ll2.c(String.class, AssetFileDescriptor.class, new C9150qn3());
        ll2.c(Uri.class, InputStream.class, new C8785pk(applicationContext.getAssets()));
        ll2.c(Uri.class, AssetFileDescriptor.class, new C8442ok(applicationContext.getAssets()));
        ll2.c(Uri.class, InputStream.class, new C3876bS1(applicationContext));
        ll2.c(Uri.class, InputStream.class, new C5250fS1(applicationContext));
        if (i >= 29) {
            ll2.c(Uri.class, InputStream.class, new C11023wF2(applicationContext));
            ll2.c(Uri.class, ParcelFileDescriptor.class, new C10680vF2(applicationContext));
        }
        ll2.c(Uri.class, InputStream.class, new Q24(contentResolver));
        ll2.c(Uri.class, ParcelFileDescriptor.class, new O24(contentResolver));
        ll2.c(Uri.class, AssetFileDescriptor.class, new N24(contentResolver));
        ll2.c(Uri.class, InputStream.class, new Q34());
        ll2.c(URL.class, InputStream.class, new C10958w34());
        ll2.c(Uri.class, File.class, new WR1(applicationContext));
        ll2.c(C5788h01.class, InputStream.class, new S91());
        ll2.c(byte[].class, ByteBuffer.class, new C11353xD());
        ll2.c(byte[].class, InputStream.class, new BD());
        ll2.c(Uri.class, Uri.class, interfaceC8374oY1);
        ll2.c(Drawable.class, Drawable.class, interfaceC8374oY1);
        ll2.a(new C9574s14(), Drawable.class, Drawable.class, "legacy_append");
        ll2.h(Bitmap.class, BitmapDrawable.class, new C7493ly(resources));
        ll2.h(Bitmap.class, byte[].class, c5431fy);
        ll2.h(Drawable.class, byte[].class, new C0356Ct0(interfaceC11610xy, c5431fy, c5628gZ0));
        ll2.h(C5284fZ0.class, byte[].class, c5628gZ0);
        RO2 p942 = new P94(interfaceC11610xy, new K94());
        ll2.a(p942, ByteBuffer.class, Bitmap.class, "legacy_append");
        ll2.a(new C6805jy(resources, p942), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        Iterator it = list.iterator();
        if (it.hasNext()) {
            X5.a(it.next());
            throw null;
        }
        if (abstractC7392lh != null) {
            abstractC7392lh.c(applicationContext, aVar, ll2);
        }
        return ll2;
    }
}
