package org.chromium.chrome.browser.download;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MimeUtils {
    public static final HashSet a = new HashSet(Arrays.asList("text/plain", "application/octet-stream", "binary/octet-stream", "octet/stream", "application/download", "application/force-download", "application/unknown"));
    public static final ArrayList b = new ArrayList(Arrays.asList("application/vnd.oma.dd+xml", "application/pdf", "application/x-x509-ca-cert", "application/x-x509-user-cert", "application/x-x509-server-cert", "application/x-pkcs12", "application/application/x-pem-file", "application/pkix-cert", "application/x-wifi-config"));

    public static String remapGenericMimeType(String str, String str2, String str3) {
        String fileExtensionFromUrl;
        int lastIndexOf;
        if (TextUtils.isEmpty(str)) {
            str = "application/unknown";
        }
        if (!a.contains(str)) {
            return str;
        }
        if (!TextUtils.isEmpty(str3) && (lastIndexOf = str3.lastIndexOf(".")) > 0) {
            fileExtensionFromUrl = str3.substring(lastIndexOf + 1);
        } else {
            fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str2);
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : fileExtensionFromUrl.equals("dm") ? "application/vnd.oma.drm.message" : fileExtensionFromUrl.equals("dd") ? "application/vnd.oma.dd+xml" : str;
    }

    public static boolean isOMADownloadDescription(String str) {
        return "application/vnd.oma.dd+xml".equalsIgnoreCase(str);
    }

    public static boolean canAutoOpenMimeType(String str) {
        return b.contains(str);
    }
}
