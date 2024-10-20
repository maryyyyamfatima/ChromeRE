package defpackage;

import J.N;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.chrome.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import org.chromium.base.task.PostTask;
import org.chromium.components.browser_ui.photo_picker.PickerBitmapView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ui0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2640Ui0 extends AbstractBinderC0137Bb1 implements InterfaceC1341Ki0 {
    public static int w;
    public static InterfaceC0079Ap3 x;
    public final Context a;
    public final ContentResolver g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final boolean p;
    public C2250Ri0 q;
    public final ArrayList r;
    public boolean s;
    public InterfaceC12162zb1 t;
    public final ServiceConnectionC2120Qi0 u;
    public final PriorityQueue v;

    public BinderC2640Ui0(InterfaceC2380Si0 interfaceC2380Si0, Context context) {
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        this.u = new ServiceConnectionC2120Qi0(this);
        this.v = new PriorityQueue(1, new Comparator() { // from class: Pi0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                C2250Ri0 c2250Ri0 = (C2250Ri0) obj;
                C2250Ri0 c2250Ri02 = (C2250Ri0) obj2;
                int i = c2250Ri0.d;
                int i2 = c2250Ri02.d;
                if (i != i2) {
                    return i - i2;
                }
                if (i == 3) {
                    boolean z = c2250Ri02.e;
                    boolean z2 = c2250Ri0.e;
                    if (z2 != z) {
                        return z2 ? -1 : 1;
                    }
                }
                return c2250Ri0.f - c2250Ri02.f;
            }
        });
        arrayList.add(interfaceC2380Si0);
        this.a = context;
        this.g = context.getContentResolver();
        this.p = N.M8R55Xut(N.MFo$BeWw(1), "animate_thumbnails", false);
    }

    public final void h() {
        ParcelFileDescriptor parcelFileDescriptor;
        PriorityQueue priorityQueue = this.v;
        C2250Ri0 c2250Ri0 = priorityQueue.isEmpty() ? null : (C2250Ri0) priorityQueue.remove();
        this.q = c2250Ri0;
        if (c2250Ri0 != null) {
            c2250Ri0.h = SystemClock.elapsedRealtime();
            C2250Ri0 c2250Ri02 = this.q;
            int i = c2250Ri02.d;
            Uri uri = c2250Ri02.a;
            if (i == 3) {
                new C1471Li0(this, this.g, c2250Ri02.a, c2250Ri02.b, c2250Ri02.c, c2250Ri02.e ? 1 : 10, 2000).c(AbstractC0185Bl.e);
                return;
            }
            if (this.t == null) {
                AbstractC4851eH1.a("ImageDecoderHost", "Connection to decoder service unexpectedly terminated.", new Object[0]);
                e(this.q.a.getPath());
                return;
            }
            Bundle bundle = new Bundle();
            C7432ln3 b = C7432ln3.b();
            try {
                try {
                    parcelFileDescriptor = this.g.openAssetFileDescriptor(uri, "r").getParcelFileDescriptor();
                } catch (FileNotFoundException e) {
                    AbstractC4851eH1.a("ImageDecoderHost", "Unable to obtain FileDescriptor: " + e, new Object[0]);
                    e(uri.getPath());
                } catch (IllegalStateException e2) {
                    AbstractC4851eH1.a("ImageDecoderHost", "Invalid ContentResolver state: " + e2, new Object[0]);
                    e(uri.getPath());
                }
                if (parcelFileDescriptor == null) {
                    e(uri.getPath());
                    b.close();
                    return;
                }
                b.close();
                bundle.putString("file_path", uri.getPath());
                bundle.putParcelable("file_descriptor", parcelFileDescriptor);
                bundle.putInt("width", c2250Ri02.b);
                bundle.putBoolean("full_width", c2250Ri02.c);
                try {
                    this.t.l(bundle, this);
                    parcelFileDescriptor.close();
                    return;
                } catch (RemoteException e3) {
                    AbstractC4851eH1.a("ImageDecoderHost", "Communications failed (Remote): " + e3, new Object[0]);
                    e(uri.getPath());
                    return;
                } catch (IOException e4) {
                    AbstractC4851eH1.a("ImageDecoderHost", "Communications failed (IO): " + e4, new Object[0]);
                    e(uri.getPath());
                    return;
                }
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        int i2 = this.h;
        int i3 = this.i;
        int i4 = i2 + i3 + this.j;
        if (i4 > 0) {
            EI2.l((i3 * 100) / i4, "Android.PhotoPicker.DecoderHostFailureRuntime");
            EI2.l((this.j * 100) / i4, "Android.PhotoPicker.DecoderHostFailureOutOfMemory");
            this.h = 0;
            this.i = 0;
            this.j = 0;
        }
        int i5 = this.k;
        int i6 = this.l;
        int i7 = i5 + i6 + this.m + this.n + this.o;
        if (i7 > 0) {
            EI2.l((i6 * 100) / i7, "Android.PhotoPicker.DecoderHostVideoFileError");
            EI2.l((this.m * 100) / i7, "Android.PhotoPicker.DecoderHostVideoRuntimeError");
            EI2.l((this.n * 100) / i7, "Android.PhotoPicker.DecoderHostVideoIoError");
            EI2.l((this.o * 100) / i7, "Android.PhotoPicker.DecoderHostVideoUnknownError");
            this.k = 0;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            ((InterfaceC2380Si0) it.next()).getClass();
        }
    }

    public final void M0(Uri uri, List list, String str, boolean z, int i, float f) {
        if (i != 0) {
            if (i == 1) {
                this.l++;
            } else if (i == 2) {
                this.m++;
            } else if (i == 3) {
                this.n++;
            }
        } else if (list == null || list.size() == 0) {
            this.o++;
        } else {
            this.k++;
        }
        a(uri.getPath(), true, z, list, str, -1L, f);
    }

    @Override // defpackage.InterfaceC0267Cb1
    public final void m0(final Bundle bundle) {
        PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: Oi0
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue;
                Bundle bundle2 = bundle;
                BinderC2640Ui0 binderC2640Ui0 = BinderC2640Ui0.this;
                binderC2640Ui0.getClass();
                String str = "";
                Boolean bool = Boolean.FALSE;
                ArrayList arrayList = null;
                float f = 0.0f;
                long j = -1;
                try {
                    try {
                        str = bundle2.getString("file_path");
                        Bitmap bitmap = Boolean.valueOf(bundle2.getBoolean("success")).booleanValue() ? (Bitmap) bundle2.getParcelable("image_bitmap") : null;
                        f = bundle2.getFloat("ratio");
                        j = bundle2.getLong("decode_time");
                        bool = Boolean.valueOf(bundle2.getBoolean("full_width"));
                        binderC2640Ui0.h++;
                        ArrayList arrayList2 = new ArrayList(1);
                        try {
                            arrayList2.add(bitmap);
                            arrayList = arrayList2;
                            booleanValue = bool.booleanValue();
                        } catch (OutOfMemoryError unused) {
                            arrayList = arrayList2;
                            binderC2640Ui0.j++;
                            booleanValue = bool.booleanValue();
                            binderC2640Ui0.a(str, false, booleanValue, arrayList, null, j, f);
                        } catch (RuntimeException unused2) {
                            arrayList = arrayList2;
                            binderC2640Ui0.i++;
                            booleanValue = bool.booleanValue();
                            binderC2640Ui0.a(str, false, booleanValue, arrayList, null, j, f);
                        } catch (Throwable th) {
                            arrayList = arrayList2;
                            th = th;
                            binderC2640Ui0.a(str, false, bool.booleanValue(), arrayList, null, j, f);
                            throw th;
                        }
                    } catch (OutOfMemoryError unused3) {
                    } catch (RuntimeException unused4) {
                    }
                    binderC2640Ui0.a(str, false, booleanValue, arrayList, null, j, f);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        });
    }

    public final void e(String str) {
        a(str, false, false, null, null, -1L, 1.0f);
    }

    public final void a(String str, boolean z, boolean z2, List list, String str2, long j, float f) {
        C9533ru2 c9533ru2;
        PickerBitmapView pickerBitmapView;
        int i;
        List list2;
        Bitmap bitmap;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z && list != null) {
            if (list.size() > 1) {
                EI2.n(elapsedRealtime - this.q.h, "Android.PhotoPicker.RequestProcessTimeAnimation");
            } else {
                EI2.n(elapsedRealtime - this.q.h, "Android.PhotoPicker.RequestProcessTimeThumbnail");
            }
        } else {
            EI2.n(elapsedRealtime - this.q.h, "Android.PhotoPicker.RequestProcessTime");
        }
        C6785ju2 c6785ju2 = (C6785ju2) this.q.g;
        c6785ju2.getClass();
        if (list != null && list.size() != 0 && (z || ((bitmap = (Bitmap) list.get(0)) != null && bitmap.getWidth() != 0 && bitmap.getHeight() != 0))) {
            if (z2) {
                c9533ru2 = (C9533ru2) c6785ju2.z.e().get(str);
            } else {
                c9533ru2 = (C9533ru2) c6785ju2.z.f().get(str);
            }
            if (c9533ru2 == null || ((list2 = c9533ru2.a) != null && list2.size() < list.size())) {
                if (z2) {
                    c6785ju2.z.e().put(str, new C9533ru2(list, str2, f));
                } else {
                    c6785ju2.z.f().put(str, new C9533ru2(list, str2, f));
                }
            }
            Object obj = c6785ju2.z.i().get(str);
            PickerBitmapView pickerBitmapView2 = c6785ju2.A;
            if (obj == null) {
                pickerBitmapView = pickerBitmapView2;
                new C0120Ay(c6785ju2.z.i(), (Bitmap) list.get(0), str, str2, pickerBitmapView2.getContext().getResources().getDimensionPixelSize(R.dimen.f38420_resource_name_obfuscated_res_0x7f080669), f).c(AbstractC0185Bl.e);
            } else {
                pickerBitmapView = pickerBitmapView2;
            }
            C6441iu2 c6441iu2 = c6785ju2.B;
            if (TextUtils.equals((c6441iu2 == null || !((i = c6441iu2.h) == 0 || i == 3)) ? null : c6441iu2.a.getPath(), str) && pickerBitmapView.r(list, str2, f)) {
                pickerBitmapView.r.setAlpha(0.0f);
                pickerBitmapView.r.animate().alpha(1.0f).setDuration(200L).start();
            }
        }
        if (j != -1 && list != null && list.get(0) != null) {
            int byteCount = ((Bitmap) list.get(0)).getByteCount() / 1024;
            if (z) {
                if (list.size() > 1) {
                    EI2.n(j, "Android.PhotoPicker.VideoDecodeTimeAnimation");
                } else {
                    EI2.n(j, "Android.PhotoPicker.VideoDecodeTimeThumbnail");
                    EI2.f(byteCount, 1, 100000, 50, "Android.PhotoPicker.VideoByteCount");
                }
            } else {
                EI2.n(j, "Android.PhotoPicker.ImageDecodeTime");
                EI2.f(byteCount, 1, 100000, 50, "Android.PhotoPicker.ImageByteCount");
            }
        }
        this.q = null;
        h();
    }
}
