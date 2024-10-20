package org.chromium.ui.base;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import defpackage.AbstractC4199cO1;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC8192o0;
import defpackage.V60;
import java.io.IOException;
import java.util.Arrays;
import org.chromium.base.LocaleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ResourceBundle {
    public static String[] a;

    public static void setNoAvailableLocalePaks() {
        a = new String[0];
    }

    public static String getLocalePakResourcePath(String str, boolean z, boolean z2) {
        String str2;
        String[] strArr = a;
        if (strArr == null || Arrays.binarySearch(strArr, str) < 0) {
            return null;
        }
        if (!z) {
            str2 = "assets/stored-locales/";
        } else if (str.equals("en-US")) {
            str2 = "assets/fallback-locales/";
        } else {
            String b = LocaleUtils.b(str);
            b.getClass();
            b.hashCode();
            char c = 65535;
            switch (b.hashCode()) {
                case 3325:
                    if (b.equals("he")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3355:
                    if (b.equals("id")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3856:
                    if (b.equals("yi")) {
                        c = 2;
                        break;
                    }
                    break;
                case 101385:
                    if (b.equals("fil")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    b = "iw";
                    break;
                case 1:
                    b = "in";
                    break;
                case 2:
                    b = "ji";
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    b = "tl";
                    break;
            }
            str2 = AbstractC4199cO1.a("assets/locales#lang_", b, "/");
        }
        String a2 = AbstractC8192o0.a(str2, str, ".pak");
        AssetManager assets = V60.a.getAssets();
        try {
            AssetFileDescriptor openNonAssetFd = assets.openNonAssetFd(a2);
            if (openNonAssetFd != null) {
                openNonAssetFd.close();
            }
            return a2;
        } catch (IOException e) {
            String a3 = AbstractC4199cO1.a("assets/locales/", str, ".pak");
            try {
                AssetFileDescriptor openNonAssetFd2 = assets.openNonAssetFd(a3);
                if (openNonAssetFd2 != null) {
                    openNonAssetFd2.close();
                }
                return a3;
            } catch (IOException unused) {
                if (z2) {
                    AbstractC4851eH1.a("ResourceBundle", "path=%s", a2, e);
                }
                return null;
            }
        }
    }
}
