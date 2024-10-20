package defpackage;

import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.base.ContentUriUtils;
import org.chromium.base.PathUtils;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9513rr0 {
    public boolean a;
    public boolean b;
    public C7797mr0 c;
    public ArrayList d;
    public String e;
    public final ArrayList f = new ArrayList();

    public C9513rr0() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_REMOVED");
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addDataScheme("file");
        V60.a.registerReceiver(new C8485or0(this), intentFilter);
    }

    public final void a(Callback callback) {
        if (!this.b && this.a) {
            PostTask.c(AbstractC5103f04.a, callback.e0(this.d));
            return;
        }
        this.f.add(callback);
        if (this.c != null) {
            return;
        }
        C7797mr0 c7797mr0 = new C7797mr0(this, new C8141nr0());
        this.c = c7797mr0;
        c7797mr0.c(AbstractC0185Bl.e);
    }

    public static File b() {
        String downloadsDirectory = PathUtils.getDownloadsDirectory();
        if (TextUtils.isEmpty(downloadsDirectory)) {
            return null;
        }
        File file = new File(downloadsDirectory);
        if (!file.exists()) {
            try {
                file.mkdirs();
            } catch (SecurityException e) {
                AbstractC4851eH1.a("DownloadDirectory", "Exception when creating download directory.", e);
            }
        }
        return file;
    }

    public static boolean c(String str) {
        if (!ContentUriUtils.e(str) && str != null) {
            String[] allPrivateDownloadsDirectories = PathUtils.getAllPrivateDownloadsDirectories();
            for (int i = 1; i < allPrivateDownloadsDirectories.length; i++) {
                if (str.startsWith(allPrivateDownloadsDirectories[i])) {
                    return true;
                }
            }
            if (Build.VERSION.SDK_INT >= 30) {
                for (String str2 : PathUtils.getExternalDownloadVolumesNames()) {
                    if (str.startsWith(str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
