package defpackage;

import android.util.Patterns;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import org.chromium.base.PiiElider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ZH1 {
    public static File a(File file, C0781Ga0 c0781Ga0) {
        AbstractC4851eH1.d("LogcatCrashExtractor", "Trying to extract logcat for minidump %s.", file.getName());
        try {
            file = new C7681mX1(c0781Ga0, file, b()).b();
            AbstractC4851eH1.d("LogcatCrashExtractor", "Succeeded extracting logcat to %s.", file.getName());
            return file;
        } catch (IOException | InterruptedException e) {
            AbstractC4851eH1.f("LogcatCrashExtractor", e.toString(), new Object[0]);
            return file;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    public static List b() {
        Process exec = Runtime.getRuntime().exec("logcat -d");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        ?? linkedList = new LinkedList();
        Integer num = null;
        while (num == null) {
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        linkedList.add(readLine);
                        if (linkedList.size() > 1024) {
                            linkedList.removeFirst();
                        }
                    } else {
                        try {
                            break;
                        } catch (IllegalThreadStateException unused) {
                            Thread.sleep(500L);
                        }
                    }
                } catch (Throwable th) {
                    bufferedReader.close();
                    throw th;
                }
            }
            num = Integer.valueOf(exec.exitValue());
        }
        bufferedReader.close();
        if (num.intValue() != 0) {
            String str = "Logcat failed: " + num;
            AbstractC4851eH1.f("LogcatCrashExtractor", str, new Object[0]);
            throw new IOException(str);
        }
        int size = linkedList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((String) linkedList.get(size)).contains("-----BEGIN BREAKPAD MICRODUMP-----")) {
                linkedList = linkedList.subList(0, size);
                linkedList.add("-----SNIPPED OUT BREAKPAD MICRODUMP FOR THIS CRASH-----");
                break;
            }
        }
        int size2 = linkedList.size();
        List<String> list = linkedList;
        if (size2 > 256) {
            list = linkedList.subList(linkedList.size() - 256, linkedList.size());
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str2 : list) {
            Pattern pattern = PiiElider.a;
            arrayList.add(PiiElider.d.matcher(PiiElider.c.matcher(Patterns.IP_ADDRESS.matcher(PiiElider.a(Patterns.EMAIL_ADDRESS.matcher(str2).replaceAll("XXX@EMAIL.ELIDED"))).replaceAll("1.2.3.4")).replaceAll("01:23:45:67:89:AB")).replaceAll("[ELIDED:CONSOLE(0)] ELIDED CONSOLE MESSAGE"));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
