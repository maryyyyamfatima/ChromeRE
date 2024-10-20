package defpackage;

import J.N;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import org.chromium.base.EarlyTraceEvent;
import org.chromium.base.ThreadUtils;
import org.chromium.base.process_launcher.FileDescriptorInfo;
import org.chromium.content.app.ContentChildProcessServiceDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AK implements Runnable {
    public final /* synthetic */ BK a;

    public AK(BK bk) {
        this.a = bk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr;
        BK bk;
        FileDescriptorInfo[] fileDescriptorInfoArr;
        long startUptimeMillis;
        boolean isIsolated;
        try {
            synchronized (this.a.i) {
                while (true) {
                    BK bk2 = this.a;
                    strArr = bk2.j;
                    if (strArr != null) {
                        break;
                    } else {
                        bk2.i.wait();
                    }
                }
            }
            AX.h(strArr);
            if (AX.e().g("renderer-wait-for-java-debugger")) {
                Debug.waitForDebugger();
            }
            EarlyTraceEvent.g();
            BK bk3 = this.a;
            ((ContentChildProcessServiceDelegate) bk3.a).a(bk3.c);
            synchronized (this.a.e) {
                BK bk4 = this.a;
                bk4.l = true;
                bk4.e.notifyAll();
            }
            synchronized (this.a.i) {
                this.a.i.notifyAll();
                while (true) {
                    bk = this.a;
                    fileDescriptorInfoArr = bk.k;
                    if (fileDescriptorInfoArr != null) {
                        break;
                    } else {
                        bk.i.wait();
                    }
                }
            }
            SparseArray sparseArray = ((ContentChildProcessServiceDelegate) bk.a).d;
            int[] iArr = new int[fileDescriptorInfoArr.length];
            String[] strArr2 = new String[fileDescriptorInfoArr.length];
            int[] iArr2 = new int[fileDescriptorInfoArr.length];
            long[] jArr = new long[fileDescriptorInfoArr.length];
            long[] jArr2 = new long[fileDescriptorInfoArr.length];
            int i = 0;
            while (true) {
                FileDescriptorInfo[] fileDescriptorInfoArr2 = this.a.k;
                if (i >= fileDescriptorInfoArr2.length) {
                    break;
                }
                FileDescriptorInfo fileDescriptorInfo = fileDescriptorInfoArr2[i];
                String str = sparseArray != null ? (String) sparseArray.get(fileDescriptorInfo.a) : null;
                if (str != null) {
                    strArr2[i] = str;
                } else {
                    iArr[i] = fileDescriptorInfo.a;
                }
                iArr2[i] = fileDescriptorInfo.g.detachFd();
                jArr[i] = fileDescriptorInfo.h;
                jArr2[i] = fileDescriptorInfo.i;
                i++;
            }
            N.Ma6rsNQO(strArr2, iArr, iArr2, jArr, jArr2);
            ContentChildProcessServiceDelegate contentChildProcessServiceDelegate = (ContentChildProcessServiceDelegate) this.a.a;
            N.MBlO3kR9(contentChildProcessServiceDelegate, contentChildProcessServiceDelegate.b, contentChildProcessServiceDelegate.c);
            ThreadUtils.b().post(new Runnable() { // from class: f50
                @Override // java.lang.Runnable
                public final void run() {
                    N.M8I$ZbIR();
                    Object obj = ThreadUtils.a;
                    V60.a.registerComponentCallbacks(new ComponentCallbacks2C10401uS1("ChildService"));
                }
            });
            if (Build.VERSION.SDK_INT >= 24) {
                long uptimeMillis = SystemClock.uptimeMillis();
                startUptimeMillis = Process.getStartUptimeMillis();
                long j = uptimeMillis - startUptimeMillis;
                isIsolated = Process.isIsolated();
                String str2 = isIsolated ? ".Isolated" : ".NotIsolated";
                EI2.k(j, "Android.ChildProcessStartTimeV2.All");
                EI2.k(j, "Android.ChildProcessStartTimeV2".concat(str2));
            }
            ((ContentChildProcessServiceDelegate) this.a.a).getClass();
            N.M1Y_XVCN(false);
            try {
                this.a.n.e0();
            } catch (RemoteException e) {
                AbstractC4851eH1.a("ChildProcessService", "Failed to call clean exit callback.", e);
            }
            N.McvJWQ0j();
        } catch (Throwable th) {
            try {
                this.a.n.T(BK.class.getName() + "\n" + Log.getStackTraceString(th));
            } catch (RemoteException e2) {
                AbstractC4851eH1.a("ChildProcessService", "Failed to call reportExceptionInInit.", e2);
            }
            throw new RuntimeException(th);
        }
    }
}
