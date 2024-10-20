package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.util.Objects;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vX2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10770vX2 extends ContentObserver {
    public final C11113wX2 a;
    public final /* synthetic */ C11113wX2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10770vX2(C11113wX2 c11113wX2, C11113wX2 c11113wX22) {
        super(null);
        this.b = c11113wX2;
        this.a = c11113wX22;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        onChange(z, null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, final Uri uri) {
        Objects.toString(uri);
        final String uri2 = uri.toString();
        if (!uri.toString().startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString())) {
            AbstractC4851eH1.f("ScreenshotMonitor", "uri: %s is not valid. Returning without processing screenshot", uri);
        } else {
            PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: uX2
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    String str2;
                    String str3;
                    boolean z2;
                    C7432ln3 e;
                    Uri uri3 = uri;
                    C10770vX2 c10770vX2 = C10770vX2.this;
                    C11113wX2 c11113wX2 = c10770vX2.a;
                    if (c11113wX2 != null) {
                        c10770vX2.b.getClass();
                        Object obj = ThreadUtils.a;
                        String[] strArr = {"datetaken", "_data", "height", "width", "_id"};
                        if (Y50.a(V60.a, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            FI2.a("Tab.Screenshot.WithoutStoragePermission");
                        } else {
                            Cursor cursor = null;
                            try {
                                e = C7432ln3.e();
                            } catch (SecurityException e2) {
                                AbstractC4851eH1.a("ScreenshotMonitor", "Cannot query media store.", e2);
                            }
                            try {
                                cursor = V60.a.getContentResolver().query(uri3, strArr, null, null, null);
                                e.close();
                                if (cursor != null) {
                                    try {
                                        if (cursor.moveToNext()) {
                                            str = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                                            str2 = cursor.getString(cursor.getColumnIndexOrThrow("height"));
                                            str3 = cursor.getString(cursor.getColumnIndexOrThrow("width"));
                                        } else {
                                            str = "";
                                            str2 = "";
                                            str3 = str2;
                                        }
                                        cursor.close();
                                        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && str.indexOf("Screenshot") != -1) {
                                            Point point = AbstractC1895Op0.b(V60.a).c;
                                            int i = point.x;
                                            int i2 = point.y;
                                            int parseInt = Integer.parseInt(str2);
                                            int parseInt2 = Integer.parseInt(str3);
                                            if (i == parseInt || i2 == parseInt2 || i == parseInt2 || i2 == parseInt) {
                                                z2 = true;
                                                if (z2 || !c11113wX2.c || uri2 == null) {
                                                    return;
                                                }
                                                final WO3 wo3 = (WO3) c11113wX2.a;
                                                Object obj2 = ((C8385oa2) wo3.p).g;
                                                LU3.a(AbstractC1741Nk1.b(wo3.h, obj2 == null && ((Tab) obj2).isIncognito())).notifyEvent("screenshot_taken_chrome_in_foreground");
                                                PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: UO3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        WO3 wo32 = WO3.this;
                                                        C8385oa2 c8385oa2 = (C8385oa2) wo32.p;
                                                        wo32.b((Tab) c8385oa2.g, "IPH_DownloadPageScreenshot");
                                                        GX2 V0 = GX2.V0((Tab) c8385oa2.g);
                                                        if (V0 != null) {
                                                            FI2.a("Tab.Screenshot");
                                                            V0.a++;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    } catch (Throwable th) {
                                        cursor.close();
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                try {
                                    e.close();
                                } catch (Throwable unused) {
                                }
                                throw th2;
                            }
                        }
                        z2 = false;
                        if (z2) {
                            return;
                        }
                        final WO3 wo32 = (WO3) c11113wX2.a;
                        Object obj22 = ((C8385oa2) wo32.p).g;
                        LU3.a(AbstractC1741Nk1.b(wo32.h, obj22 == null && ((Tab) obj22).isIncognito())).notifyEvent("screenshot_taken_chrome_in_foreground");
                        PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: UO3
                            @Override // java.lang.Runnable
                            public final void run() {
                                WO3 wo322 = WO3.this;
                                C8385oa2 c8385oa2 = (C8385oa2) wo322.p;
                                wo322.b((Tab) c8385oa2.g, "IPH_DownloadPageScreenshot");
                                GX2 V0 = GX2.V0((Tab) c8385oa2.g);
                                if (V0 != null) {
                                    FI2.a("Tab.Screenshot");
                                    V0.a++;
                                }
                            }
                        });
                    }
                }
            });
        }
    }
}
