package org.chromium.ui.base;

import J.N;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.android.chrome.R;
import defpackage.AbstractC0185Bl;
import defpackage.AbstractC3217Yt2;
import defpackage.AbstractC6205iD;
import defpackage.C10951w23;
import defpackage.C11294x23;
import defpackage.C11637y23;
import defpackage.C11980z23;
import defpackage.C1861Oi1;
import defpackage.C7432ln3;
import defpackage.DialogC3693au2;
import defpackage.EI2;
import defpackage.InterfaceC0218Br2;
import defpackage.InterfaceC4037bu2;
import defpackage.InterfaceC4352cp4;
import defpackage.V60;
import defpackage.Y50;
import defpackage.ZN3;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.chromium.ui.base.SelectFileDialog;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SelectFileDialog implements InterfaceC4352cp4, InterfaceC4037bu2 {
    public static final long p = TimeUnit.HOURS.toMillis(1);
    public static final String[] q = {".apng", ".bmp", ".gif", ".jpeg", ".jpg", ".pdf", ".png", ".tif", ".tiff", ".xcf", ".webp"};
    public static final String[] r = {".asf", ".avhcd", ".avi", ".divx", ".flv", ".mov", ".mp4", ".mpeg", ".mpg", ".swf", ".wmv", ".webm", ".mkv"};
    public static AbstractC3217Yt2 s;
    public static DialogC3693au2 t;
    public final long a;
    public ArrayList g;
    public boolean h;
    public boolean i;
    public Uri j;
    public WindowAndroid k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;

    public static Intent f(SelectFileDialog selectFileDialog) {
        selectFileDialog.getClass();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.setFlags(3);
        intent.putExtra("output", selectFileDialog.j);
        C7432ln3 c = C7432ln3.c();
        try {
            intent.setClipData(ClipData.newUri(V60.a.getContentResolver(), "images", selectFileDialog.j));
            c.close();
            return intent;
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public SelectFileDialog(long j) {
        this.a = j;
    }

    public final void selectFile(String[] strArr, boolean z, boolean z2, WindowAndroid windowAndroid) {
        this.g = new ArrayList(Arrays.asList(strArr));
        this.h = z;
        this.i = z2;
        this.k = windowAndroid;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        windowAndroid.getClass();
        this.l = WindowAndroid.i(intent);
        WindowAndroid windowAndroid2 = this.k;
        Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
        windowAndroid2.getClass();
        this.m = WindowAndroid.i(intent2);
        WindowAndroid windowAndroid3 = this.k;
        Intent intent3 = new Intent("android.provider.MediaStore.RECORD_SOUND");
        windowAndroid3.getClass();
        this.n = WindowAndroid.i(intent3);
        ArrayList arrayList = new ArrayList();
        final boolean p2 = p();
        if (p2) {
            if (AbstractC6205iD.a()) {
                if (!windowAndroid.hasPermission("android.permission.READ_MEDIA_IMAGES") && e("image")) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                }
                if (!windowAndroid.hasPermission("android.permission.READ_MEDIA_VIDEO") && e("video")) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
            } else if (!windowAndroid.hasPermission("android.permission.READ_EXTERNAL_STORAGE")) {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            }
        } else {
            if (((this.l && e("image")) || (this.m && e("video"))) && !windowAndroid.hasPermission("android.permission.CAMERA")) {
                arrayList.add("android.permission.CAMERA");
            }
            if (this.n && e("audio") && !windowAndroid.hasPermission("android.permission.RECORD_AUDIO")) {
                arrayList.add("android.permission.RECORD_AUDIO");
            }
        }
        if (arrayList.isEmpty()) {
            k();
        } else {
            final String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
            windowAndroid.b(strArr2, new InterfaceC0218Br2() { // from class: t23
                @Override // defpackage.InterfaceC0218Br2
                public final void b(int[] iArr, String[] strArr3) {
                    String[] strArr4 = SelectFileDialog.q;
                    SelectFileDialog selectFileDialog = SelectFileDialog.this;
                    selectFileDialog.getClass();
                    for (int i = 0; i < iArr.length; i++) {
                        if (iArr[i] == -1) {
                            if (selectFileDialog.h) {
                                selectFileDialog.m();
                                return;
                            }
                            boolean z3 = p2;
                            if (z3) {
                                int length = strArr3.length;
                                String[] strArr5 = strArr2;
                                if (length != strArr5.length) {
                                    throw new RuntimeException(String.format("Permissions arrays misaligned: %d != %d", Integer.valueOf(strArr3.length), Integer.valueOf(strArr5.length)));
                                }
                                if (!strArr3[i].equals(strArr5[i])) {
                                    throw new RuntimeException(String.format("Permissions arrays don't match: %s != %s", strArr3[i], strArr5[i]));
                                }
                            }
                            if (z3 && (strArr3[i].equals("android.permission.READ_EXTERNAL_STORAGE") || strArr3[i].equals("android.permission.READ_MEDIA_IMAGES") || strArr3[i].equals("android.permission.READ_MEDIA_VIDEO"))) {
                                selectFileDialog.m();
                                return;
                            }
                        }
                    }
                    selectFileDialog.k();
                }
            });
        }
    }

    public final void k() {
        boolean hasPermission = this.k.hasPermission("android.permission.CAMERA");
        if (this.l && hasPermission) {
            new C11294x23(this, Boolean.FALSE, this.k, this).c(AbstractC0185Bl.e);
        } else {
            l(null);
        }
    }

    public final void q(Intent intent, Intent intent2, Intent intent3) {
        boolean z;
        Intent intent4 = new Intent("android.intent.action.GET_CONTENT");
        if (this.i) {
            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        ArrayList arrayList = new ArrayList();
        if (this.g.size() == 1) {
            z = true ^ this.g.contains("*/*");
        } else {
            Iterator it = this.g.iterator();
            String str = null;
            boolean z2 = false;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                int indexOf = str2.indexOf(47);
                if (indexOf != -1) {
                    String substring = str2.substring(0, indexOf);
                    boolean equals = str2.substring(indexOf + 1).equals("*");
                    if (str == null) {
                        str = substring;
                    } else if (!str.equals(substring)) {
                    }
                    if (equals) {
                        z2 = true;
                    }
                }
                z = false;
            }
            z = z2;
        }
        if (z) {
            if (e("image")) {
                if (intent != null) {
                    arrayList.add(intent);
                }
                intent4.setType("image/*");
            } else if (e("video")) {
                if (intent2 != null) {
                    arrayList.add(intent2);
                }
                intent4.setType("video/*");
            } else if (e("audio")) {
                if (intent3 != null) {
                    arrayList.add(intent3);
                }
                intent4.setType("audio/*");
            }
            intent4.addCategory("android.intent.category.OPENABLE");
        }
        if (intent4.getType() == null) {
            intent4.setType("*/*");
            if (intent != null) {
                arrayList.add(intent);
            }
            if (intent2 != null) {
                arrayList.add(intent2);
            }
            if (intent3 != null) {
                arrayList.add(intent3);
            }
        }
        Intent intent5 = new Intent("android.intent.action.CHOOSER");
        if (!arrayList.isEmpty()) {
            intent5.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Intent[0]));
        }
        intent5.putExtra("android.intent.extra.INTENT", intent4);
        if (this.k.B(intent5, this, Integer.valueOf(R.string.0_resource_name_obfuscated_res_0x7f1405dd))) {
            return;
        }
        m();
    }

    public final boolean p() {
        ArrayList g = g(this.g);
        if (!(this.h && d("image")) && g != null) {
            if ((s != null) && this.k.k().get() != null) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList g(List list) {
        if (list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.length() == 0) {
                str = "";
            } else {
                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
                if (fileExtensionFromUrl.length() > 0 && (str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl)) == null) {
                    str = "application/octet-stream";
                }
            }
            if (!str.startsWith("image/")) {
                boolean z = false;
                if (Build.VERSION.SDK_INT >= 26) {
                    AbstractC3217Yt2 abstractC3217Yt2 = s;
                    if (abstractC3217Yt2 != null) {
                        abstractC3217Yt2.getClass();
                        z = N.MRiRQ_Ey(N.MFo$BeWw(1));
                    }
                }
                if (!z || !str.startsWith("video/")) {
                    return null;
                }
            }
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC4037bu2
    public final void a(int i, Uri[] uriArr) {
        if (i == 0) {
            m();
            return;
        }
        if (i == 1) {
            if (uriArr.length == 0) {
                m();
                return;
            } else {
                new C11637y23(this, V60.a, uriArr.length > 1, uriArr).c(AbstractC0185Bl.e);
                return;
            }
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            this.o = false;
            q(null, null, null);
            return;
        }
        if (!this.k.hasPermission("android.permission.CAMERA")) {
            this.k.b(new String[]{"android.permission.CAMERA"}, new InterfaceC0218Br2() { // from class: u23
                @Override // defpackage.InterfaceC0218Br2
                public final void b(int[] iArr, String[] strArr) {
                    String[] strArr2 = SelectFileDialog.q;
                    SelectFileDialog selectFileDialog = SelectFileDialog.this;
                    selectFileDialog.getClass();
                    if (iArr[0] == -1) {
                        selectFileDialog.m();
                    } else {
                        new C11294x23(selectFileDialog, Boolean.TRUE, selectFileDialog.k, selectFileDialog).c(AbstractC0185Bl.e);
                    }
                }
            });
        } else {
            new C11294x23(this, Boolean.TRUE, this.k, this).c(AbstractC0185Bl.e);
        }
    }

    @Override // defpackage.InterfaceC4037bu2
    public final void c() {
        t = null;
    }

    public static boolean j(Context context, String str) {
        File file;
        File file2 = new File(str);
        Object obj = Y50.a;
        if (Build.VERSION.SDK_INT < 24) {
            String str2 = context.getApplicationInfo().dataDir;
            file = str2 != null ? new File(str2) : null;
        } else {
            file = context.getDataDir();
        }
        try {
            return file2.getCanonicalPath().startsWith(file.getCanonicalPath());
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean i(Context context, Uri uri) {
        Path path;
        Path readSymbolicLink;
        String path2;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        try {
            path = Paths.get("/proc/self/fd/" + context.getContentResolver().openFileDescriptor(uri, "r").getFd(), new String[0]);
            readSymbolicLink = Files.readSymbolicLink(path);
            path2 = readSymbolicLink.toString();
            return j(context, path2);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.InterfaceC4352cp4
    public final void b(Intent intent, int i) {
        DialogC3693au2 dialogC3693au2 = t;
        if (dialogC3693au2 != null) {
            dialogC3693au2.m = true;
            dialogC3693au2.dismiss();
        }
        if (i != -1) {
            m();
            return;
        }
        if (intent == null || (intent.getData() == null && intent.getClipData() == null)) {
            String path = "file".equals(this.j.getScheme()) ? this.j.getPath() : this.j.toString();
            String schemeSpecificPart = this.j.getSchemeSpecificPart();
            this.k.getClass();
            if (j(V60.a, schemeSpecificPart)) {
                m();
                return;
            }
            n(this.a, path, this.j.getLastPathSegment());
            WindowAndroid windowAndroid = this.k;
            Intent intent2 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", this.j);
            windowAndroid.getClass();
            V60.a.sendBroadcast(intent2);
            return;
        }
        if (intent.getData() == null && intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            int itemCount = clipData.getItemCount();
            if (itemCount == 0) {
                m();
                return;
            }
            Uri[] uriArr = new Uri[itemCount];
            for (int i2 = 0; i2 < itemCount; i2++) {
                uriArr[i2] = clipData.getItemAt(i2).getUri();
            }
            new C11637y23(this, V60.a, true, uriArr).c(AbstractC0185Bl.e);
            return;
        }
        if ("file".equals(intent.getData().getScheme())) {
            String path2 = intent.getData().getPath();
            if (!TextUtils.isEmpty(path2)) {
                new C10951w23(this, V60.a, path2).c(AbstractC0185Bl.e);
                return;
            }
        }
        if ("content".equals(intent.getScheme())) {
            new C11637y23(this, V60.a, false, new Uri[]{intent.getData()}).c(AbstractC0185Bl.e);
            return;
        }
        m();
        C1861Oi1 c1861Oi1 = WindowAndroid.B;
        String string = V60.a.getString(R.string.0_resource_name_obfuscated_res_0x7f14072e);
        if (string != null) {
            ZN3.c(V60.a, string, 0).d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.ui.base.SelectFileDialog.l(android.content.Intent):void");
    }

    public final boolean e(String str) {
        return this.g.isEmpty() || this.g.contains("*/*") || h(str) > 0;
    }

    public final boolean d(String str) {
        return h(str) == this.g.size();
    }

    public final int h(String str) {
        Iterator it = this.g.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(str)) {
                i++;
            }
        }
        return i;
    }

    public final void o(String[] strArr) {
        if (g(this.g) != null) {
            EI2.d(strArr.length, "Android.SelectFileDialogImgCount");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            new C11980z23(this, strArr, this.o).c(AbstractC0185Bl.e);
        }
    }

    public final void n(long j, String str, String str2) {
        o(new String[]{str});
        N.MBeWYy2V(j, this, str, str2);
    }

    public final void m() {
        o(new String[0]);
        N.MGVJOCWv(this.a, this);
    }

    public static SelectFileDialog create(long j) {
        return new SelectFileDialog(j);
    }
}
