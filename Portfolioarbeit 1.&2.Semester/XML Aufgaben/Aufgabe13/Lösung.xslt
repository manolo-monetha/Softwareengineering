<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/MASH">
        <html>
            <body>
                <h2>Mash</h2>
                <strong>Grain Temperature:</strong>
                <span>
                    <xsl:value-of select="GRAIN_TEMP"/>
                </span>
                °C
                <ul>
                    <xsl:for-each select="MASH_STEPS/MASH_STEP">
                        <li>
                            Temperature:
                            <span>
                                <xsl:value-of select="STEP_TEMP"/>
                            </span>
                            Time:
                            <span>
                                <xsl:value-of select="STEP_TIME"/>
                            </span>
                        </li>
                    </xsl:for-each>
                </ul>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
