package defpackage;

import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cu4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4382cu4 {
    public static String a(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String str = "";
        String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        if (replaceFirst.equals("base-master")) {
            return "";
        }
        String str2 = "base-";
        if (replaceFirst.startsWith("base-")) {
            str = "config.";
        } else {
            replaceFirst = replaceFirst.replace("-", ".config.");
            str2 = ".config.master";
        }
        return replaceFirst.replace(str2, str);
    }
}
