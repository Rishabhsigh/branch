/**
 * 
 */
package com.his.co.model;

import lombok.Data;

/**
 * @author Rishu
 *
 */
@Data()
public class CoPdfModel {
	Integer coPdfId;
	long caseNumber;
	byte [] pdfDocument;
	String planName;
	String PlanStatus;

}//CoPdfModel
