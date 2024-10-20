package defpackage;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.chromium.base.BuildInfo;
import org.chromium.base.PiiElider;
import org.chromium.chrome.browser.crash.MinidumpUploadServiceImpl;
import org.chromium.components.crash.CrashKeys;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iF2 */
/* loaded from: classes2.dex */
public abstract class AbstractC6218iF2 {
    public boolean a;
    public File b;
    public FileOutputStream c;
    public final File f;
    public final String d = UUID.randomUUID().toString().replace("-", "").substring(0, 16);
    public final String e = "------------" + UUID.randomUUID() + "\r\n";
    public final boolean g = true;

    public AbstractC6218iF2(File file) {
        this.f = file;
    }

    public final void b(Throwable th) {
        C7432ln3 e = C7432ln3.e();
        try {
            c(th);
            FileOutputStream fileOutputStream = this.c;
            if (fileOutputStream != null) {
                try {
                    try {
                        fileOutputStream.flush();
                        this.c.close();
                    } finally {
                        this.c = null;
                    }
                } catch (Throwable unused) {
                    this.b = null;
                }
            }
            File file = this.b;
            if (file != null && this.a) {
                if (this.g) {
                    this.b = ZH1.a(file, new C0781Ga0(this.f));
                }
                try {
                    MinidumpUploadServiceImpl.g(this.b);
                } catch (SecurityException e2) {
                    AbstractC4851eH1.f("LogcatExtraction", e2.toString(), new Object[0]);
                }
            }
            e.close();
        } catch (Throwable th2) {
            try {
                e.close();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }

    public final void a(String str, String str2) {
        try {
            this.c.write(AbstractC9771sd.b(this.e));
        } catch (IOException unused) {
        }
        try {
            this.c.write(AbstractC9771sd.b(AbstractC4199cO1.a("Content-Disposition: form-data; name=\"", str, "\"")));
        } catch (IOException unused2) {
        }
        try {
            this.c.write(AbstractC9771sd.b(AbstractC4199cO1.a("\r\n\r\n", str2, "\r\n")));
        } catch (IOException unused3) {
        }
    }

    public final void c(Throwable th) {
        try {
            String str = "chromium-browser-minidump-" + this.d + ".dmp";
            File file = new File(this.f, "Crash Reports");
            this.a = file.exists();
            String f = AX.e().f("breakpad-dump-location");
            if (f != null) {
                file = new File(f);
                file.mkdirs();
            }
            this.b = new File(file, str);
            this.c = new FileOutputStream(this.b);
            String b = V60.b();
            if (b == null || !b.contains(":")) {
                b = "browser";
            }
            BuildInfo buildInfo = AbstractC6547jD.a;
            a("prod", "Chrome_Android");
            a("ptype", b);
            a("device", Build.DEVICE);
            a("ver", "105.0.5195.136");
            a("channel", "");
            a("android_build_id", Build.ID);
            a("model", Build.MODEL);
            a("brand", Build.BRAND);
            a("board", Build.BOARD);
            a("android_build_fp", buildInfo.i);
            a("sdk", String.valueOf(Build.VERSION.SDK_INT));
            a("gms_core_version", buildInfo.g);
            a("installer_package_name", buildInfo.f);
            a("abi_name", buildInfo.h);
            a("exception_info", PiiElider.sanitizeStacktrace(Log.getStackTraceString(th)));
            a("early_java_exception", "true");
            a("package", String.format("%s v%s (%s)", BuildInfo.n, Long.valueOf(buildInfo.d), buildInfo.e));
            a("custom_themes", buildInfo.j);
            a("resources_version", buildInfo.k);
            AtomicReferenceArray atomicReferenceArray = CrashKeys.getInstance().a;
            for (int i = 0; i < atomicReferenceArray.length(); i++) {
                String str2 = (String) atomicReferenceArray.get(i);
                if (str2 != null) {
                    a(CrashKeys.c[i], str2);
                }
            }
            try {
                this.c.write(AbstractC9771sd.b(this.e));
            } catch (IOException unused) {
            }
        } catch (FileNotFoundException unused2) {
            this.b = null;
            this.c = null;
        }
    }
}
