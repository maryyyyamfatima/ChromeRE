package defpackage;

import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import org.chromium.base.PathUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8141nr0 {
    public static C9171qr0 a() {
        ArrayList arrayList = new ArrayList();
        String[] allPrivateDownloadsDirectories = PathUtils.getAllPrivateDownloadsDirectories();
        for (int i = 1; i < allPrivateDownloadsDirectories.length; i++) {
            arrayList.add(new File(allPrivateDownloadsDirectories[i]));
        }
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT > 29) {
            for (String str : PathUtils.getExternalDownloadVolumesNames()) {
                arrayList2.add(new File(str));
            }
            return new C9171qr0(arrayList2, arrayList);
        }
        return new C9171qr0(null, arrayList);
    }
}
