package org.chromium.media;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.os.Build;
import android.util.Range;
import defpackage.AbstractC4851eH1;
import defpackage.C11100wV;
import defpackage.C11443xV;
import defpackage.C3507aN1;
import defpackage.C3851bN1;
import defpackage.ZM1;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MediaCodecUtil {
    public static boolean platformSupportsCbcsEncryption(int i) {
        return i >= 25;
    }

    public static boolean f(MediaCodecInfo mediaCodecInfo) {
        boolean isHardwareAccelerated;
        if (Build.VERSION.SDK_INT >= 29) {
            isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
            return !isHardwareAccelerated;
        }
        String lowerCase = mediaCodecInfo.getName().toLowerCase(Locale.ROOT);
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.google.") || lowerCase.startsWith("c2.android.");
    }

    public static String getDefaultCodecName(String str, int i, boolean z) {
        C3507aN1 c3507aN1 = new C3507aN1(new C3851bN1());
        while (true) {
            if (c3507aN1.hasNext()) {
                MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) c3507aN1.next();
                if (mediaCodecInfo.isEncoder() == i && (!z || f(mediaCodecInfo))) {
                    for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                        if (str2.equalsIgnoreCase(str)) {
                            return mediaCodecInfo.getName();
                        }
                    }
                }
            } else {
                AbstractC4851eH1.a("MediaCodecUtil", "Decoder for type %s is not supported on this device", str);
                return "";
            }
        }
    }

    public static int[] getEncoderColorFormatsForMime(String str) {
        C3507aN1 c3507aN1 = new C3507aN1(new C3851bN1());
        while (c3507aN1.hasNext()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) c3507aN1.next();
            if (mediaCodecInfo.isEncoder()) {
                for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        try {
                            return mediaCodecInfo.getCapabilitiesForType(str2).colorFormats;
                        } catch (IllegalArgumentException unused) {
                            continue;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean canDecode(java.lang.String r6, boolean r7) {
        /*
            boolean r0 = isDecoderSupportedForDevice(r6)
            java.lang.String r1 = "MediaCodecUtil"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L14
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r2] = r6
            java.lang.String r6 = "Decoder for type %s is not supported on this device"
            defpackage.AbstractC4851eH1.a(r1, r6, r7)
            return r2
        L14:
            bN1 r0 = new bN1
            r0.<init>()
            android.media.MediaCodecInfo[] r4 = r0.a
            if (r4 == 0) goto L1f
            r4 = r3
            goto L20
        L1f:
            r4 = r2
        L20:
            if (r4 == 0) goto L55
            aN1 r1 = new aN1
            r1.<init>(r0)
        L27:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r1.next()
            android.media.MediaCodecInfo r0 = (android.media.MediaCodecInfo) r0
            boolean r4 = r0.isEncoder()
            if (r4 == 0) goto L3a
            goto L27
        L3a:
            android.media.MediaCodecInfo$CodecCapabilities r0 = r0.getCapabilitiesForType(r6)     // Catch: java.lang.IllegalArgumentException -> L27
            if (r0 == 0) goto L27
            java.lang.String r4 = "secure-playback"
            if (r7 == 0) goto L4b
            boolean r5 = r0.isFeatureSupported(r4)     // Catch: java.lang.IllegalArgumentException -> L27
            if (r5 == 0) goto L4b
            return r3
        L4b:
            if (r7 != 0) goto L27
            boolean r0 = r0.isFeatureRequired(r4)     // Catch: java.lang.IllegalArgumentException -> L27
            if (r0 != 0) goto L27
            return r3
        L54:
            return r2
        L55:
            r0 = 0
            ZM1 r6 = c(r6, r7, r0)
            android.media.MediaCodec r6 = r6.a
            if (r6 != 0) goto L5f
            return r2
        L5f:
            r6.release()     // Catch: java.lang.IllegalStateException -> L63
            goto L6d
        L63:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r2] = r6
            java.lang.String r6 = "Cannot release media codec"
            defpackage.AbstractC4851eH1.a(r1, r6, r7)
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.media.MediaCodecUtil.canDecode(java.lang.String, boolean):boolean");
    }

    public static void a(C11443xV c11443xV, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int[][] iArr = {new int[]{200, 10}, new int[]{800, 11}, new int[]{1800, 20}, new int[]{3600, 21}, new int[]{7200, 30}, new int[]{12000, 31}, new int[]{18000, 40}, new int[]{30000, 41}, new int[]{60000, 50}, new int[]{120000, 51}, new int[]{180000, 52}};
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        for (int i = 0; i < 11; i++) {
            int[] iArr2 = iArr[i];
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            if (videoCapabilities.getBitrateRange().contains((Range<Integer>) Integer.valueOf(i2))) {
                c11443xV.a.add(new CodecProfileLevelList$CodecProfileLevelAdapter(7, 12, i3));
            }
        }
    }

    public static Object[] getSupportedCodecProfileLevels() {
        C11443xV c11443xV = new C11443xV();
        C3507aN1 c3507aN1 = new C3507aN1(new C3851bN1());
        while (true) {
            boolean hasNext = c3507aN1.hasNext();
            ArrayList arrayList = c11443xV.a;
            if (!hasNext) {
                return arrayList.toArray();
            }
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) c3507aN1.next();
            for (String str : mediaCodecInfo.getSupportedTypes()) {
                if (!isDecoderSupportedForDevice(str)) {
                    AbstractC4851eH1.f("MediaCodecUtil", "Decoder for type %s disabled on this device", str);
                } else {
                    try {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        if (str.endsWith("vp9") && Build.VERSION.SDK_INT <= 23) {
                            a(c11443xV, capabilitiesForType);
                        } else {
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                try {
                                    int a = C11443xV.a(str);
                                    arrayList.add(new CodecProfileLevelList$CodecProfileLevelAdapter(a, C11443xV.c(a, codecProfileLevel.profile), C11443xV.b(a, codecProfileLevel.level)));
                                } catch (C11100wV unused) {
                                }
                            }
                        }
                    } catch (IllegalArgumentException unused2) {
                    }
                }
            }
        }
    }

    public static ZM1 c(String str, int i, MediaCrypto mediaCrypto) {
        ZM1 zm1 = new ZM1();
        if (!isDecoderSupportedForDevice(str)) {
            AbstractC4851eH1.a("MediaCodecUtil", "Decoder for type %s is not supported on this device", str);
            return zm1;
        }
        try {
            if ((str.startsWith("video") && i == 1) || (str.startsWith("audio") && mediaCrypto != null && mediaCrypto.requiresSecureDecoderComponent(str))) {
                String defaultCodecName = getDefaultCodecName(str, 0, false);
                if (defaultCodecName.equals("")) {
                    return zm1;
                }
                MediaCodec createByCodecName = MediaCodec.createByCodecName(defaultCodecName);
                zm1.b = b(createByCodecName, str);
                createByCodecName.release();
                zm1.a = MediaCodec.createByCodecName(defaultCodecName.concat(".secure"));
            } else {
                if (i == 2) {
                    zm1.a = MediaCodec.createByCodecName(getDefaultCodecName(str, 0, true));
                } else if (str.equals("audio/raw")) {
                    zm1.a = MediaCodec.createByCodecName("OMX.google.raw.decoder");
                } else {
                    zm1.a = MediaCodec.createDecoderByType(str);
                }
                zm1.b = b(zm1.a, str);
            }
        } catch (Exception e) {
            AbstractC4851eH1.a("MediaCodecUtil", "Failed to create MediaCodec: %s, codecType: %d", str, Integer.valueOf(i), e);
            zm1.a = null;
        }
        return zm1;
    }

    public static boolean isDecoderSupportedForDevice(String str) {
        if (str.equals("video/x-vnd.on2.vp8")) {
            String str2 = Build.HARDWARE;
            if (str2.startsWith("mt")) {
                if (Build.VERSION.SDK_INT < 28) {
                    return false;
                }
                return str2.startsWith("mt5599") || str2.startsWith("mt5895") || str2.startsWith("mt8768") || str2.startsWith("mt5887");
            }
        } else if (str.equals("video/x-vnd.on2.vp9")) {
            if (Build.MODEL.equals("Nexus Player")) {
                return false;
            }
        } else if (str.equals("video/av01")) {
            if (Build.VERSION.SDK_INT < 29) {
                return false;
            }
        } else if (str.equals("video/dolby-vision") && Build.VERSION.SDK_INT < 24) {
            return false;
        }
        return true;
    }

    public static boolean b(MediaCodec mediaCodec, String str) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        if (mediaCodec == null) {
            return false;
        }
        try {
            MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
            if (codecInfo.isEncoder() || (capabilitiesForType = codecInfo.getCapabilitiesForType(str)) == null) {
                return false;
            }
            return capabilitiesForType.isFeatureSupported("adaptive-playback");
        } catch (IllegalArgumentException e) {
            AbstractC4851eH1.a("MediaCodecUtil", "Cannot retrieve codec information", e);
            return false;
        }
    }

    public static ZM1 d(String str) {
        int i;
        ZM1 zm1 = new ZM1();
        Integer e = e(str);
        if (e == null) {
            return zm1;
        }
        try {
            zm1.a = MediaCodec.createEncoderByType(str);
            zm1.b = false;
            int intValue = e.intValue();
            if (intValue == 0 || intValue == 1 || intValue == 2) {
                i = 0;
            } else {
                if (intValue != 4 && intValue != 5 && intValue != 6 && intValue != 7) {
                    throw new IllegalArgumentException("Invalid HWEncoder decoder parameter.");
                }
                i = 1;
            }
            zm1.c = i;
        } catch (Exception e2) {
            AbstractC4851eH1.a("MediaCodecUtil", "Failed to create MediaCodec: %s", str, e2);
        }
        return zm1;
    }

    public static boolean isEncoderSupportedByDevice(String str) {
        return e(str) != null;
    }

    public static boolean isSetOutputSurfaceSupported() {
        String str = Build.HARDWARE;
        return (str.equalsIgnoreCase("hi6210sft") || str.equalsIgnoreCase("hi6250")) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:            if (r2.startsWith("omx." + r5 + ".") != false) goto L41;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:            if (r2.startsWith("c2." + r5 + ".") == false) goto L69;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:            continue;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:            r5 = android.os.Build.VERSION.SDK_INT;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:            switch(r0) {            case 0: goto L48;            case 1: goto L48;            case 2: goto L47;            case 3: goto L47;            case 4: goto L48;            case 5: goto L46;            case 6: goto L45;            case 7: goto L44;            default: goto L43;        };     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:            r6 = -1;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:            if (r5 >= r6) goto L60;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bf, code lost:            defpackage.AbstractC4851eH1.f("MediaCodecUtil", "Codec " + r2 + " is disabled due to SDK version " + r5, new java.lang.Object[0]);     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e2, code lost:            return java.lang.Integer.valueOf(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00af, code lost:            r6 = 30;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b2, code lost:            r6 = 24;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:            r6 = 27;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b8, code lost:            r6 = 23;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bb, code lost:            r6 = 21;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Integer e(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.media.MediaCodecUtil.e(java.lang.String):java.lang.Integer");
    }
}
