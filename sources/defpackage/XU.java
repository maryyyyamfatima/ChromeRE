package defpackage;

import J.N;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ParagraphStyle;
import android.text.style.UpdateAppearance;
import android.view.textclassifier.TextLinks;
import android.view.textclassifier.TextLinks$TextLink;
import com.android.chrome.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import org.chromium.base.Callback;
import org.chromium.ui.base.Clipboard;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class XU extends Clipboard implements ClipboardManager.OnPrimaryClipChangedListener {
    public final Context c = V60.a;
    public final ClipboardManager d;
    public QU e;
    public PU f;

    public XU(ClipboardManager clipboardManager) {
        this.d = clipboardManager;
        clipboardManager.addPrimaryClipChangedListener(this);
    }

    @Override // org.chromium.ui.base.Clipboard
    public final String getCoercedText() {
        try {
            return this.d.getPrimaryClip().getItemAt(0).coerceToText(this.c).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // org.chromium.ui.base.Clipboard
    public final boolean hasCoercedText() {
        ClipDescription primaryClipDescription = this.d.getPrimaryClipDescription();
        if (primaryClipDescription == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 28) {
            return !TextUtils.isEmpty(getCoercedText());
        }
        return primaryClipDescription.hasMimeType("text/plain") || primaryClipDescription.hasMimeType("text/html") || primaryClipDescription.hasMimeType("text/x-moz-url");
    }

    public static boolean l(Spanned spanned) {
        Class[] clsArr = {CharacterStyle.class, ParagraphStyle.class, UpdateAppearance.class};
        for (int i = 0; i < 3; i++) {
            if (spanned.nextSpanTransition(-1, spanned.length(), clsArr[i]) < spanned.length()) {
                return true;
            }
        }
        return false;
    }

    public static String i(ClipData clipData) {
        String html;
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/html")) {
            return clipData.getItemAt(0).getHtmlText();
        }
        if (description.hasMimeType("text/plain")) {
            CharSequence text = clipData.getItemAt(0).getText();
            if (!(text instanceof Spanned)) {
                return null;
            }
            Spanned spanned = (Spanned) text;
            if (l(spanned)) {
                if (Build.VERSION.SDK_INT >= 24) {
                    html = Html.toHtml(spanned, 0);
                    return html;
                }
                return Html.toHtml(spanned);
            }
        }
        return null;
    }

    @Override // org.chromium.ui.base.Clipboard
    public final String getHTMLText() {
        try {
            return i(this.d.getPrimaryClip());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:            if (r0 == false) goto L112;     */
    @Override // org.chromium.ui.base.Clipboard
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasHTMLOrStyledText() {
        /*
            r5 = this;
            android.content.ClipboardManager r0 = r5.d
            android.content.ClipDescription r1 = r0.getPrimaryClipDescription()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.String r3 = "text/plain"
            boolean r3 = r1.hasMimeType(r3)
            if (r3 == 0) goto L37
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L1d
            boolean r0 = defpackage.AbstractC11835ye.a(r1)
            goto L35
        L1d:
            android.content.ClipData r0 = r0.getPrimaryClip()     // Catch: java.lang.Exception -> L34
            android.content.ClipData$Item r0 = r0.getItemAt(r2)     // Catch: java.lang.Exception -> L34
            java.lang.CharSequence r0 = r0.getText()     // Catch: java.lang.Exception -> L34
            boolean r3 = r0 instanceof android.text.Spanned
            if (r3 == 0) goto L34
            android.text.Spanned r0 = (android.text.Spanned) r0
            boolean r0 = l(r0)
            goto L35
        L34:
            r0 = r2
        L35:
            if (r0 != 0) goto L3f
        L37:
            java.lang.String r0 = "text/html"
            boolean r0 = r1.hasMimeType(r0)
            if (r0 == 0) goto L40
        L3f:
            r2 = 1
        L40:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XU.hasHTMLOrStyledText():boolean");
    }

    @Override // org.chromium.ui.base.Clipboard
    public final boolean hasUrl() {
        int classificationStatus;
        float confidenceScore;
        if (Build.VERSION.SDK_INT < 31) {
            return new GURL(getCoercedText()).b;
        }
        ClipDescription primaryClipDescription = this.d.getPrimaryClipDescription();
        if (primaryClipDescription == null) {
            return false;
        }
        if (primaryClipDescription.hasMimeType("text/x-moz-url")) {
            return true;
        }
        if (!primaryClipDescription.hasMimeType("text/*")) {
            return false;
        }
        classificationStatus = primaryClipDescription.getClassificationStatus();
        if (!(classificationStatus == 3)) {
            return false;
        }
        confidenceScore = primaryClipDescription.getConfidenceScore("url");
        return confidenceScore > 0.99f;
    }

    @Override // org.chromium.ui.base.Clipboard
    public final String getUrl() {
        ClipData primaryClip;
        TextLinks textLinks;
        Collection links;
        Collection links2;
        int start;
        int end;
        CharSequence subSequence;
        if (!hasUrl()) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return getCoercedText();
        }
        try {
            primaryClip = this.d.getPrimaryClip();
        } catch (Exception unused) {
        }
        if (primaryClip.getDescription().hasMimeType("text/x-moz-url")) {
            subSequence = getCoercedText();
        } else {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            textLinks = itemAt.getTextLinks();
            if (textLinks != null) {
                links = textLinks.getLinks();
                if (!links.isEmpty()) {
                    CharSequence text = itemAt.getText();
                    links2 = textLinks.getLinks();
                    TextLinks$TextLink textLinks$TextLink = (TextLinks$TextLink) links2.iterator().next();
                    start = textLinks$TextLink.getStart();
                    end = textLinks$TextLink.getEnd();
                    subSequence = text.subSequence(start, end);
                }
            }
            return null;
        }
        if (subSequence == null) {
            return null;
        }
        return AbstractC10615v34.a(subSequence.toString()).i();
    }

    public final Uri k() {
        try {
            ClipData primaryClip = this.d.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() != 0) {
                ClipDescription description = primaryClip.getDescription();
                if (description != null && description.hasMimeType("image/*")) {
                    return primaryClip.getItemAt(0).getUri();
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // org.chromium.ui.base.Clipboard
    public final Uri c() {
        PU b;
        Uri uri;
        if (this.e != null && (b = QU.b()) != null && (uri = b.a) != null) {
            if (Build.VERSION.SDK_INT < 26) {
                if (uri.equals(k())) {
                    return uri;
                }
                this.e.getClass();
                QU.a();
                return null;
            }
            long j = j();
            if (j != 0 && this.e != null) {
                if (j == b.b) {
                    return uri;
                }
                QU.a();
                return null;
            }
        }
        return null;
    }

    @Override // org.chromium.ui.base.Clipboard
    public final String getImageUriString() {
        Uri k = k();
        if (k == null) {
            return null;
        }
        return k.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:            r0.close();     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00af: MOVE (r1 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:56:0x00af */
    @Override // org.chromium.ui.base.Clipboard
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] getPng() {
        /*
            r10 = this;
            java.lang.Object r0 = org.chromium.base.ThreadUtils.a
            android.net.Uri r0 = r10.k()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.content.Context r2 = defpackage.V60.a
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r3 = r2.getType(r0)
            java.lang.String r4 = "image/png"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r4 = 100000000(0x5f5e100, double:4.94065646E-316)
            if (r3 != 0) goto L63
            boolean r3 = r10.hasImage()
            if (r3 != 0) goto L26
            return r1
        L26:
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L62
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L62
            r8 = 28
            if (r3 < r8) goto L39
            android.graphics.ImageDecoder$Source r0 = defpackage.AbstractC8056nd.a(r2, r0)     // Catch: java.lang.Throwable -> L62
            android.graphics.Bitmap r0 = defpackage.AbstractC8400od.a(r0)     // Catch: java.lang.Throwable -> L62
            goto L3d
        L39:
            android.graphics.Bitmap r0 = android.provider.MediaStore.Images.Media.getBitmap(r2, r0)     // Catch: java.lang.Throwable -> L62
        L3d:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L62
            r2.<init>()     // Catch: java.lang.Throwable -> L62
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L62
            r8 = 100
            r0.compress(r3, r8, r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = "Android.ClipBoard.getImageDuration.NonPngImages"
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L62
            long r8 = r8 - r6
            defpackage.EI2.k(r8, r0)     // Catch: java.lang.Throwable -> L62
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L62
            long r6 = (long) r0     // Catch: java.lang.Throwable -> L62
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L5d
            return r1
        L5d:
            byte[] r0 = r2.toByteArray()     // Catch: java.lang.Throwable -> L62
            return r0
        L62:
            return r1
        L63:
            java.lang.String r3 = "r"
            android.content.res.AssetFileDescriptor r0 = r2.openAssetFileDescriptor(r0, r3)     // Catch: java.lang.Throwable -> Lb7 java.io.IOException -> Lbc
            if (r0 == 0) goto Lb1
            long r2 = r0.getLength()     // Catch: java.lang.Throwable -> La8
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto Lb1
            long r2 = r0.getLength()     // Catch: java.lang.Throwable -> La8
            r4 = -1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L7e
            goto Lb1
        L7e:
            long r2 = r0.getLength()     // Catch: java.lang.Throwable -> La8
            int r2 = (int) r2     // Catch: java.lang.Throwable -> La8
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> La8
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> La8
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> La8
            java.io.FileDescriptor r6 = r0.getFileDescriptor()     // Catch: java.lang.Throwable -> La8
            r5.<init>(r6)     // Catch: java.lang.Throwable -> La8
            r5.read(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.String r6 = "Android.ClipBoard.getImageDuration.PngImages"
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> La6
            long r7 = r7 - r3
            defpackage.EI2.k(r7, r6)     // Catch: java.lang.Throwable -> La6
            r0.close()     // Catch: java.lang.Throwable -> Lae java.io.IOException -> Lbd
            defpackage.AbstractC2663Um3.a(r5)
            return r2
        La6:
            r2 = move-exception
            goto Laa
        La8:
            r2 = move-exception
            r5 = r1
        Laa:
            r0.close()     // Catch: java.lang.Throwable -> Lad
        Lad:
            throw r2     // Catch: java.lang.Throwable -> Lae java.io.IOException -> Lbd
        Lae:
            r0 = move-exception
            r1 = r5
            goto Lb8
        Lb1:
            if (r0 == 0) goto Lb6
            r0.close()     // Catch: java.lang.Throwable -> Lb7 java.io.IOException -> Lbc
        Lb6:
            return r1
        Lb7:
            r0 = move-exception
        Lb8:
            defpackage.AbstractC2663Um3.a(r1)
            throw r0
        Lbc:
            r5 = r1
        Lbd:
            defpackage.AbstractC2663Um3.a(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XU.getPng():byte[]");
    }

    @Override // org.chromium.ui.base.Clipboard
    public final boolean hasImage() {
        ClipDescription primaryClipDescription = this.d.getPrimaryClipDescription();
        return primaryClipDescription != null && primaryClipDescription.hasMimeType("image/*");
    }

    public final long j() {
        ClipDescription primaryClipDescription;
        long timestamp;
        if (Build.VERSION.SDK_INT < 26 || (primaryClipDescription = this.d.getPrimaryClipDescription()) == null || !primaryClipDescription.hasMimeType("image/*")) {
            return 0L;
        }
        timestamp = primaryClipDescription.getTimestamp();
        return timestamp;
    }

    @Override // org.chromium.ui.base.Clipboard
    public final void setText(String str) {
        h("text", str);
    }

    @Override // org.chromium.ui.base.Clipboard
    public final void h(String str, String str2) {
        m(ClipData.newPlainText(str, str2));
    }

    @Override // org.chromium.ui.base.Clipboard
    public final void setHTMLText(String str, String str2) {
        m(ClipData.newHtmlText("html", str2, str));
    }

    @Override // org.chromium.ui.base.Clipboard
    public final void g(String str) {
        ClipData newPlainText = ClipData.newPlainText("password", str);
        if (Build.VERSION.SDK_INT >= 24) {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putBoolean("android.content.extra.IS_SENSITIVE", true);
            newPlainText.getDescription().setExtras(persistableBundle);
        }
        m(newPlainText);
    }

    @Override // org.chromium.ui.base.Clipboard
    public final void setImage(byte[] bArr, String str) {
        QU qu = this.e;
        if (qu == null) {
            return;
        }
        Callback callback = new Callback() { // from class: VU
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                XU.this.f((Uri) obj);
            }
        };
        qu.getClass();
        AbstractC5832h73.e(bArr, str, callback);
    }

    @Override // org.chromium.ui.base.Clipboard
    public final void clear() {
        if (Build.VERSION.SDK_INT > 28) {
            try {
                this.d.clearPrimaryClip();
                return;
            } catch (Exception unused) {
                m(ClipData.newPlainText(null, null));
                return;
            }
        }
        m(ClipData.newPlainText(null, null));
    }

    public final boolean m(ClipData clipData) {
        try {
            C7432ln3 b = Build.MANUFACTURER.toLowerCase(Locale.US).equals("google") ? null : C7432ln3.b();
            try {
                this.d.setPrimaryClip(clipData);
                if (b == null) {
                    return true;
                }
                b.close();
                return true;
            } catch (Throwable th) {
                if (b != null) {
                    try {
                        b.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
            Context context = this.c;
            ZN3.c(context, context.getString(R.string.0_resource_name_obfuscated_res_0x7f1403d7), 0).d();
            return false;
        }
    }

    @Override // org.chromium.ui.base.Clipboard
    public final void f(Uri uri) {
        Context context = this.c;
        if (uri == null) {
            ZN3.c(context, context.getString(R.string.0_resource_name_obfuscated_res_0x7f1403d7), 0).d();
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if ((i == 26 || i == 27) && this.e != null) {
            Iterator<PackageInfo> it = context.getPackageManager().getInstalledPackages(0).iterator();
            while (it.hasNext()) {
                context.grantUriPermission(it.next().packageName, uri, 1);
            }
        }
        new WU(this, uri).c(AbstractC0185Bl.e);
    }

    @Override // org.chromium.ui.base.Clipboard
    public final void e(QU qu) {
        this.e = qu;
        PU pu = this.f;
        if (pu != null) {
            T60.a.edit().putString("Chrome.Clipboard.SharedUri", pu.a.toString()).putLong("Chrome.Clipboard.SharedUriTimestamp", pu.b).apply();
            this.f = null;
        }
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public final void onPrimaryClipChanged() {
        PU b;
        Uri uri;
        FI2.a("MobileClipboardChanged");
        int i = Build.VERSION.SDK_INT;
        if ((i == 26 || i == 27) && this.e != null && (b = QU.b()) != null && (uri = b.a) != null && !uri.equals(Uri.EMPTY) && !uri.equals(k())) {
            this.c.revokeUriPermission(uri, 1);
            this.e.getClass();
            QU.a();
        }
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.M3YqItLq(j, this);
    }

    @Override // org.chromium.ui.base.Clipboard
    public final void b(GURL gurl) {
        if (m(new ClipData("url", new String[]{"text/x-moz-url"}, new ClipData.Item(gurl.i())))) {
            ZN3.b(R.string.0_resource_name_obfuscated_res_0x7f1405c7, 0, this.c).d();
        }
    }

    @Override // org.chromium.ui.base.Clipboard
    public final void d(boolean z) {
        ClipDescription primaryClipDescription;
        long timestamp;
        if (!z || Build.VERSION.SDK_INT < 29 || (primaryClipDescription = this.d.getPrimaryClipDescription()) == null) {
            return;
        }
        timestamp = primaryClipDescription.getTimestamp();
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.MWrNP8sy(j, this, timestamp);
    }

    @Override // org.chromium.ui.base.Clipboard
    public final boolean a() {
        return this.d.hasPrimaryClip();
    }
}
