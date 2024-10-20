package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.a;
import java.io.FileInputStream;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2896Wh1 implements InterfaceC3026Xh1 {
    public final C3492aK1 a;
    public final List b;
    public final a c;

    @Override // defpackage.InterfaceC3026Xh1
    public final void c() {
    }

    @Override // defpackage.InterfaceC3026Xh1
    public final ImageHeaderParser$ImageType d() {
        SI2 si2;
        a aVar = this.c;
        C3492aK1 c3492aK1 = this.a;
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0947Hh1 interfaceC0947Hh1 = (InterfaceC0947Hh1) list.get(i);
            try {
                si2 = new SI2(new FileInputStream(aVar.a().getFileDescriptor()), c3492aK1);
            } catch (Throwable th) {
                th = th;
                si2 = null;
            }
            try {
                ImageHeaderParser$ImageType c = interfaceC0947Hh1.c(si2);
                si2.c();
                aVar.a();
                if (c != ImageHeaderParser$ImageType.UNKNOWN) {
                    return c;
                }
            } catch (Throwable th2) {
                th = th2;
                if (si2 != null) {
                    si2.c();
                }
                aVar.a();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.InterfaceC3026Xh1
    public final int a() {
        SI2 si2;
        a aVar = this.c;
        C3492aK1 c3492aK1 = this.a;
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0947Hh1 interfaceC0947Hh1 = (InterfaceC0947Hh1) list.get(i);
            try {
                si2 = new SI2(new FileInputStream(aVar.a().getFileDescriptor()), c3492aK1);
            } catch (Throwable th) {
                th = th;
                si2 = null;
            }
            try {
                int d = interfaceC0947Hh1.d(si2, c3492aK1);
                si2.c();
                aVar.a();
                if (d != -1) {
                    return d;
                }
            } catch (Throwable th2) {
                th = th2;
                if (si2 != null) {
                    si2.c();
                }
                aVar.a();
                throw th;
            }
        }
        return -1;
    }

    public C2896Wh1(ParcelFileDescriptor parcelFileDescriptor, List list, C3492aK1 c3492aK1) {
        AbstractC6464iy2.b(c3492aK1);
        this.a = c3492aK1;
        AbstractC6464iy2.b(list);
        this.b = list;
        this.c = new a(parcelFileDescriptor);
    }

    @Override // defpackage.InterfaceC3026Xh1
    public final Bitmap b(BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(this.c.a().getFileDescriptor(), null, options);
    }
}
